package Project1;

import java.io.*;
import java.util.Scanner;
import java.util.*;

/******************************************************************
 * Records Menu class.
 *
 * This file allows the creation of new records, viewing transcripts,
 * saving to or loading records from a disk, or return to the main menu
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ******************************************************************/
public class RecordsMenu implements Serializable {
    private Scanner scnr = new Scanner(System.in);
    private boolean valid = false;

    /*******************************************************************
     * addRecord.  Adding a record selects an existing student, an existing course and
     *  adds a grade and date for how and when the student completed the course.
     ******************************************************************/
    public void addRecord() {

        // ADD TRY CATCH BLOCKS AND GRADE ENTRY

        // creating a student and setting equal to the student entered
        Record record = new Record();
        Student student = new Student();
        Course course = new Course();
        Date date = new Date();

        findStudent(student, record); // using g number to find the student and create a record for that student
        findCourse(course, record); // using course prefix and number and adding it to the record
        record.setDate(date); // date is set automatically at time of entry
        courseGrade(record); // prompting user to enter grade for course

        SMS.smsInstance.addR(record);

        displayR(student);

        // FIX GRADE - ENTER OWN GRADE
    }

    /*******************************************************************
     * viewTranscript.  Displays the transcript of a student
     ******************************************************************/
    public void viewTranscript(int gNum) {
        // UPDATE TO LOOK BETTER
        ArrayList<Record> transcript = new ArrayList<Record>();

        transcript = SMS.smsInstance.findR(gNum);

        System.out.println(transcript); // fix format


    }

    /*******************************************************************
     * saveRecord.  Saves the record to a disk
     ******************************************************************/
    public void saveRecord(String filename) {
        // write file - probably need to modify to fit this program

        // trying to create new instances of FileOutputStream and ObjectOutputStream
        try {
            FileOutputStream fileOut = new FileOutputStream(filename); // creating file stream
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); // adding bytes to file
            objectOut.writeObject(SMS.smsInstance); // Zoo object writes itself to a file - using 'this' because we are in the Zoo class
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("I/O error");
        }
    }

    /*******************************************************************
     * loadRecord.  Loads the record from a disk
     ******************************************************************/
    public Record loadRecord(String filename) {
        // read file - probably need to modify to fit this program

        Record r = new Record();

        // trying to create new instances of FileInputStream and ObjectInputStream
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            r = (Record)objectIn.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (StreamCorruptedException ex) {
            System.out.println("Stream header is incorrect");
        } catch (IOException ex) {
            System.out.println("I/O error");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        }

        return r;
    }

    public Student findStudent(Student student, Record record) {

        // finding the student from the gnumber
        valid = false;
        while (!valid) {
            try {
                System.out.println("Enter the G Number of the student you would like to add a record for\n");
                student = SMS.smsInstance.findS(scnr.nextInt());
                scnr.nextLine();
                System.out.println("Student selected: \n" + student);
                record.setStudent(student);
                valid = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return student;
    }

    public void findCourse(Course course, Record record) {

        valid = false;
        while (!valid) {
            try {
                // prompt user to enter course prefix
                System.out.println("\nEnter course prefix");
                String pre = scnr.nextLine();

                // prompt user to enter course number
                System.out.println("Enter course number");
                int num = scnr.nextInt();
                scnr.nextLine();

                // find course based on prefix and number
                course = SMS.smsInstance.findC(pre, num);
                System.out.println("\nCourse selected: \n" + course);

                // add course to the record
                record.setCourse(course);
                valid = true;

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void courseGrade(Record record) {

        // Prompting user to enter grade
        valid = false;
        while (!valid) {
            try {
                System.out.println("Enter student's final grade");
                record.setGrade(scnr.nextFloat());
                scnr.nextLine();
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage()); // reading error message thrown by exception
                System.out.println("Please try again\n");
            }
        }
    }

    public void displayR(Student student) {
        System.out.println("\nRecord has been added\n");
        //System.out.println("Record for " + student.getFirstName() + " " + student.getLastName()); // may or may not work
        SMS.smsInstance.printR();
    }
}
