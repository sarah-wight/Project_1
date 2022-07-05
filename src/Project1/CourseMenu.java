package Project1;
import java.util.Scanner;

public class CourseMenu {
    private Course course = new Course();
    private Scanner scnr = new Scanner(System.in);
    private Record record = new Record();
    private SMS sms = new SMS();

    // where do we store these courses/students when done?
    public void addCourse() {

        // Prompting user to enter student information
        System.out.println("Enter course prefix");
        course.setPrefix(scnr.nextLine());

        System.out.println("Enter course number");
        course.setNumber(scnr.nextInt());
        scnr.nextLine();

        System.out.println("Enter course title");
        course.setTitle(scnr.nextLine());

        //record.setCourse(course);

        System.out.println(course);

    }
}
