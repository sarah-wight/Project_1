package Project1;
import java.util.ArrayList;
import java.lang.Exception;

/**
 * Course class.
 *
 * This file contains and edits the courses.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class Course {
    //
    private String prefix;
    private int number;
    private String title;

    /**
     * Constructor.  Sets base state of a Course object to the
     * values passed in.
     */
    public Course(){
    }

    /**
     * getPrefix.  Returns a String of the course prefix.
     * @return String
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * setPrefix.  Sets the course prefix.
     * @String prefix.
     */
    public void setPrefix(String prefix) {
        if (prefix.length() == 3){
            this.prefix = prefix;
        }
        else
            throw new RuntimeException("Enter a course Prefix that is only 3 characters");
    }

    /**
     * getNumber.  Returns an int of the course number.
     * @return int
     */
    public int getNumber() {
        return number;
    }

    /**
     * setNumber.  Sets the course number.
     * @String number.
     */
    public void setNumber(int number) {
        if(999 >= number && number > 0) {
            this.number = number;
        }
        else {
            throw new RuntimeException("Please enter a course number between 1 and 999");
        }
    }

    /**
     * getTitle.  Returns a String of the course title.
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle.  Sets the class title.
     * @String title.
     */
    public void setTitle(String title) {
        if(title != "") {
            this.title = title;
        }
        else {
            throw new RuntimeException("Please enter a course title");
        }
    }

    /**
     * toString.  Returns a formatted String with the course prefix, number, and title.
     * @return String
     */
    public String toString() {
        return prefix + " " + number + ": " + title;
    }
}
