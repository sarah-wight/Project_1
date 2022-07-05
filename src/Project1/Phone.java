package Project1;
import java.util.ArrayList;

/**
 * Record class.
 *
 * This file contains and edits the student records.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class Record {
    private Date date; // need a date class
    private Student student;
    private Course course;
    private float grade;
    private SMS sms = new SMS();

    /*public static void main(String[] args) {
        Date date = new Date();
        Student sw =  new Student();
        Course course = new Course();
        Record record1 = new Record(date, sw, course, 4.0f);
        System.out.println(record1);

    }*/

    public Record() {

    }

    public Record(Student student) {
        this.student = student;
    }

    public Record(Course course) {
        this.course = course;
    }

    public Record(Date date, Student student, Course course, float grade) {
        this.date = date;
        this.student = student;
        this.course = course;
        this.grade = grade;

        sms.addRecord(this);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        Record record = new Record(course);
        //this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Record for " + student.getFirstName() + "\n" +
                "Date: " + date + "\n" +
                "Course: " + course + "\n" +
                "Grade: " + grade;
    }
}
