package Project1;
import java.util.ArrayList;
import java.lang.Exception;

public class Course {
    private String prefix;
    private int number;
    private String title;

    // constructor
    public Course(String prefix, int number, String title){
        this.prefix = prefix;
        this.number = number;
        this.title = title;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        if (prefix.length() == 3){
            this.prefix = prefix;
        }
        else
            throw new RuntimeException("Enter a course Prefix that is only 3 characters");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(999 >= number && number > 0) {
            this.number = number;
        }
        else {
            throw new RuntimeException("Please enter a course number between 1 and 999");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != "") {
            this.title = title;
        }
        else {
            throw new RuntimeException("Please enter a course title");
        }
    }

    public String toString() {
        return prefix + " " + number + ": " + title;
    }
}
