package Project1;

import java.util.ArrayList;

/***************************************************************
 * Student Management System class.
 *
 * This file contains the records and student data
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 **************************************************************/
public class SMS {
    private ArrayList<Record> record = new ArrayList<Record>(); // arraylist to hold records
    private ArrayList<Student> student = new ArrayList<Student>(); // arraylist to hold students
    private ArrayList<Course> course = new ArrayList<Course>(); // arraylist to hold courses

    // loop thru arraylist to see if gnumber matches

    /**************************************************************
     * Main.  Allows program to run. Displays the main menu and
     * takes user input that directs to either the student,
     * course, or record menus.
     **************************************************************/
    public static void main(String[] args) {

        MainMenu mm = new MainMenu();
        mm.displayMain();

    }


    /***************************************************************
     * addS.  Adds a Student to the ArrayList of Students
     **************************************************************/
    public void addS(Student s) {
        student.add(s);
    }

    /***************************************************************
     * printS.  prints the ArrayList of Students
     **************************************************************/
    public void printS() {
        for (Student s : student) {
            System.out.println(s);
            System.out.println("END OF STUDENT\n");
        }
    }

    /***************************************************************
     * addC.  Adds a Student to the ArrayList of Students
     **************************************************************/
    public void addC(Course c) {
        course.add(c);
    }

    /***************************************************************
     * printC.  prints the ArrayList of Students
     **************************************************************/
    public void printC() {
        for (Course c : course) {
            System.out.println(c);
            System.out.println("\n");
        }
    }

}
