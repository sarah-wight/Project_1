package Project1;
import java.util.ArrayList;

public class Address {
    private int number;
    private String street;
    private String lineTwo;
    private String city;
    private String state;
    private String zip;

    public Address(){
        // what do we want here?
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        // number must be greater than 0
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        // does this have to have a street type? any other stipulations?
        this.street = street;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        // can this be blank?
        this.lineTwo = lineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        // should we capitalize each word of the string
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        // must be 2 letters only -> capitalize them?
        // have to be letter characters not any other type of char
        // could we do this using the ascii number ?
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        // must be 1-99999 -> should add zeroes to make it 5 digits
        this.zip = zip;
    }

    // need to add a toString method
}
