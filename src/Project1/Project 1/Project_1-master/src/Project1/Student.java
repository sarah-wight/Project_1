package Project1;
import java.util.ArrayList;

public class Student {
    // local variables
    private String firstName;
    private String lastName;
    private Address[] addresses;
    private ArrayList<Phone> phoneNumbers;
    private int gNumber;
    // private static int currentID = 10000000;

    // functions
    // what do we want in this class?
    public Student() {
        addresses = new Address[2];
        phoneNumbers = new ArrayList<Phone>();
        // when a new student is created do we want to force setters in here
        /*this.phone = phone;
        this.address = address;
        this.gnumber = Student.currentID;
        this.firstName = firstName;
        this.lastName = lastName;
        currentID++;*/
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        this.gNumber = gNumber;
    }

    // need toString

}
