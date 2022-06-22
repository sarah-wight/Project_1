package Project1;
import java.util.ArrayList;

public class Student {
    // local variables
    private String firstName;
    private String lastName;
    private Address[] addresses = new Address[2];
    private ArrayList<Phone> phoneNumbers = new ArrayList<Phone>();
    private int gNumber;
    // private static int currentID = 10000000;

    // functions
    // what do we want in this class?
    public Student() {
        // when a new student is created do we want to force setters in here
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // checking length and that the field is not blank
        if((firstName.length() < 50) && (firstName != "")) {
            this.firstName = firstName;
        }
        else {
            throw new RuntimeException("First name must be less than 50 characters");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // checking length and that the field is not blank
        if((lasName.length() < 50) && (lastName != "")) {
            this.lastName = lastName;
        }
        else {
            throw new RuntimeException("Last name must be less than 50 characters");
        }
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public ArrayList<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setMailingAddr(Address mailingAddr) {
        addresses[0] = mailingAddr;
    }

    public void setBillingAddr(Address billingAddr) {
        addresses[1] = billingAddr;
    }

    public void addPhone(ArrayList<Phone> i) {
        // set type
        // set primary?
        phoneNumbers.add(i);
    }

    public int getgNumber() {
        return gNumber;
    }

    public void setgNumber(int gNumber) {
        // gnum is greater than 0 and less than?
        this.gNumber = gNumber;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Mailing Address: " + addresses[0] + "\n" +
                "Billing Address: " + addresses[1] + "\n" +
                "Phone #: " + getPhoneNumbers() + "\n" +
                "G #: " + gNumber + "\n";
    }

}
