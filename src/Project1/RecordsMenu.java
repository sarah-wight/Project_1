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

    /*******************************************************************
     * addRecord.  Adding a record selects an existing student, an existing course and
     *  adds a grade and date for how and when the student completed the course.
     ******************************************************************/
    public void addRecord(int gNum) {

        // add try catch blocks and grade

        // creating a student and setting equal to the student entered
        Record record = new Record();
        Student student = new Student();
        Course course = new Course();
        Date date = new Date();

        student = SMS.smsInstance.findS(gNum);
        System.out.println("Student selected: \n" + student);
        record.setStudent(student);

        System.out.println("\nEnter course prefix");
        String pre = scnr.nextLine();

        System.out.println("Enter course number");
        int num = scnr.nextInt();
        scnr.nextLine();

        course = SMS.smsInstance.findC(pre, num);
        System.out.println("\nCourse selected: \n" + course);
        record.setCourse(course);

        record.setDate(date);
        record.setGrade(4.0f);

        SMS.smsInstance.addR(record);
        SMS.smsInstance.printR();

        // add a grade?
    }

    /*******************************************************************
     * viewTranscript.  Displays the transcript of a student
     ******************************************************************/
    public void viewTranscript() {
        // loop gnumber to get student
        // displays them and all classes and grades?
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
            objectOut.writeObject(this); // Zoo object writes itself to a file - using 'this' because we are in the Zoo class
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
}
