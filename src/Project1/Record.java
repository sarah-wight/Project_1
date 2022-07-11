package Project1;

import java.util.*;

/*******************************************************
 * Record class.
 *
 * This file contains and edits the student records.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ******************************************************/
public class Record {
    private Date date;
    private Student student;
    private Course course;
    private float grade;

    public Record() {
    }

    // need to harden the code (setters)
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

    public String toString() {
        return "Record for " + student.getFirstName() + "\n" +
                "Date: " + date + "\n" +
                "Course: " + course + "\n" +
                "Grade: " + grade;
    }
}
