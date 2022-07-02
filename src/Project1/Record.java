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

    public Record(Date date, Student student, Course course, float grade) {
        this.date = date;
        this.student = student;
        this.course = course;
        this.grade = grade;
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
        this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
