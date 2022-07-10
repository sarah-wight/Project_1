package Project1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Course Menu class.
 *
 * This file can add new courses
 *  * @author Sarah Wight, Zack Peters, Mike Rosin
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class CourseMenu {
    private Course course = new Course();
    private Scanner scnr = new Scanner(System.in);
    private Record record = new Record();
    private SMS sms = new SMS();


    // where do we store these courses/students when done?
    public void addCourse() {

        Course course = new Course();
        // Prompting user to enter student information
        System.out.println("Enter course prefix");
        course.setPrefix(scnr.nextLine());

        System.out.println("Enter course number");
        course.setNumber(scnr.nextInt());
        scnr.nextLine();

        System.out.println("Enter course title");
        course.setTitle(scnr.nextLine());

        sms.addC(course); // adding new course to the list of courses
        sms.printC();

    }
}
