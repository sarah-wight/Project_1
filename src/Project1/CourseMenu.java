package Project1;

import java.util.Scanner;

/*********************************************************
 * Course Menu class.
 *
 * This file can add new courses
 *  * @author Sarah Wight, Zack Peters, Mike Rosin
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ********************************************************/
public class CourseMenu {
    private Course course = new Course();
    private Scanner scnr = new Scanner(System.in);
    private Record record = new Record();
    private SMS sms = new SMS();
    private boolean valid = false;

    /*********************************************************
     * addCourse.  Prompts user for all required information
     * about a course.
     ********************************************************/
    public void addCourse() {
        Course course = new Course(); // creating new course

        // Prompting user to enter course prefix
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter course prefix");
                course.setPrefix(scnr.nextLine());
                valid = true; // if valid entry, break out of loop
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter course number
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter course number");
                course.setNumber(scnr.nextInt());
                scnr.nextLine();
                valid = true; // if valid entry, break out of loop
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter course title
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter course title");
                course.setTitle(scnr.nextLine());
                valid = true; // if valid entry, break out of loop
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        sms.addC(course); // adding new course to the list of courses
        sms.printC();

    }
}
