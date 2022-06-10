package Project1;
import java.util.ArrayList;

public class Course {
    private String prefix;
    private int number;
    private String title;

    public Course(){


    }

    public String getPrefix() {
        if (prefix.length() == 3){
            return prefix;
    }
    else
        throw new RuntimeException("Enter a course Prefix that is only 3 characters");
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
