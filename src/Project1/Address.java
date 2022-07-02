package Project1;
import java.util.ArrayList;

/**
 * Address class.
 *
 * This file contains and edits the addresses.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class Address {
    // local variables
    private int number;
    private String street;
    private String lineTwo;
    private String city;
    private String state;
    private int zip;

    /**
     * Constructor.  Sets base state of an Address object to the
     * values passed in.
     */
    public Address(){
        // what do we want here?
    }

    /**
     * getNumber.  Returns the number of the students address.
     * @return int
     */
    public int getNumber() {
        return number;
    }

    /**
     * setNumber.  Sets the number of the student's address to the value passed in.
     * @int number
     */
    public void setNumber(int number) {
        // number must be greater than 0
        if(number > 0) {
            this.number = number;
        }
        else {
            throw new RuntimeException("Number must be greater than 0");
        }
    }

    /**
     * getStreet.  Returns the street name of the students address.
     * @return String
     */
    public String getStreet() {
        return street;
    }

    /**
     * setStreet.  Sets the street of the student's address to the value passed in.
     * @String street
     */
    public void setStreet(String street) {
        if(street != "") {
            this.street = street;
        }
        else {
            throw new RuntimeException("Please enter a street name");
        }
    }

    /**
     * getLineTwo.  Returns line two of the students address.
     * @return String
     */
    public String getLineTwo() {
        return lineTwo;
    }

    /**
     * setLineTwo.  Sets line two of the student's address to the value passed in.
     * @String lineTwo
     */
    public void setLineTwo(String lineTwo) {
        // can this be blank?
        this.lineTwo = lineTwo;
    }

    /**
     * getCity.  Returns what city the student's address is located in.
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * setCity.  Sets the city of the student's address to the value passed in.
     * @String city
     */
    public void setCity(String city) {
        // should we capitalize each word of the string
        if(city != "") {
            this.city = city;
        }
        else {
            throw new RuntimeException("Please enter a city name");
        }
    }

    /**
     * getState.  Returns what state the student's address is located in.
     * @return String
     */
    public String getState() {
        return state;
    }

    /**
     * setState.  Sets the state of the student's address to the value passed in.
     * @String state
     */
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

    /**
     * getZip.  Returns the zipcode of the student's address.
     * @return int
     */
    public int getZip() {
        return zip;
    }

    /**
     * setZip.  Sets the zipcode of the student's address to the value passed in.
     * @int zip
     */
    public void setZip(int zip) {
        // must be 1-99999 -> should add zeroes to make it 5 digits
        if(zip >= 1 && zip <= 99999) {
            this.zip = zip;
        }
        else {
            throw new RuntimeException("Please enter a zipcode between 1 and 99999");
        }
    }

    /**
     * toString.  Returns a formatted String with the student's address.
     * @return String
     */
    public String toString() {
        return number + " " + street + "\n" + city + ", " + state + " " + zip;
    }
}

