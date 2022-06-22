package Project1;
import java.util.ArrayList;

public class Address {
    private int number;
    private String street;
    private String lineTwo;
    private String city;
    private String state;
    private int zip;

    public Address(int number, String street, String lineTwo, String city, String state, int zip){
        // what do we want here?
        this.number = number;
        this.street = street;
        this.lineTwo = lineTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        // number must be greater than 0
        if(number > 0) {
            this.number = number;
        }
        else {
            throw new RuntimeException("Number must be greater than 0");
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street != "") {
            this.street = street;
        }
        else {
            throw new RuntimeException("Please enter a street name");
        }
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
        if(city != "") {
            this.city = city;
        }
        else {
            throw new RuntimeException("Please enter a city name");
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        // must be 2 letters only -> capitalize them?
        // have to be letter characters not any other type of char
        // could we do this using the ascii number ?
        if((state != "") && (state.length() == 2)) {
            this.state = state;
        }
        else {
            throw new RuntimeException("Please enter a state abbreviation");
        }
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        // must be 1-99999 -> should add zeroes to make it 5 digits
        if(zip >= 1 && zip <= 99999) {
            this.zip = zip;
        }
        else {
            throw new RuntimeException("Please enter a zipcode between 1 and 99999");
        }
    }

    public String toString() {
        return number + " " + street + "\n" + city + ", " + state + " " + zip;
    }
}
