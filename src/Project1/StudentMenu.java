package Project1;

import java.util.Scanner;

/**
 * Student Menu class.
 *
 * This file creates a new student or modifies an existing student
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class StudentMenu {
    private Scanner scnr = new Scanner(System.in);
    // Creating a new student and address
    private Student student = new Student();
    private Address address = new Address();
    private Phone phone = new Phone();
    private Record record = new Record();
    private SMS sms = new SMS();

    /**
     * addStudent.  Prompts user for all required information
     * about a student.
     */
    public void addStudent() {


        // Prompting user to enter student information
        System.out.println("Enter student's first name");
        student.setFirstName(scnr.nextLine());

        System.out.println("Enter student's last name");
        student.setLastName(scnr.nextLine());

        // Prompting user to enter MAILING address info
        System.out.println("Mailing Address - Enter number");
        address.setNumber(scnr.nextInt());
        scnr.nextLine(); // need this after nextInt() call to get the new line

        System.out.println("Mailing Address - Enter street name");
        address.setStreet(scnr.nextLine());

        System.out.println("Mailing Address - Enter city");
        address.setCity(scnr.nextLine());

        System.out.println("Mailing Address - Enter state");
        address.setState(scnr.nextLine());

        System.out.println("Mailing Address - Enter zipcode");
        address.setZip(scnr.nextInt());
        scnr.nextLine(); // need this after nextInt() call to get the new line

        student.setMailingAddr(address); // setting the address entered as the mailing address

        // Prompting user to enter BILLING address info
        System.out.println("Billing Address - Enter number");
        address.setNumber(scnr.nextInt());
        scnr.nextLine(); // need this after nextInt() call to get the new line

        System.out.println("Billing Address - Enter street name");
        address.setStreet(scnr.nextLine());

        System.out.println("Billing Address - Enter city");
        address.setCity(scnr.nextLine());

        System.out.println("Billing Address - Enter state");
        address.setState(scnr.nextLine());

        System.out.println("Billing Address - Enter zipcode");
        address.setZip(scnr.nextInt());
        scnr.nextLine(); // need this after nextInt() call to get the new line

        student.setBillingAddr(address); // setting the address entered as the billing address

        // Prompting user to enter PHONE NUMBER info
        System.out.println("Phone Number - Enter phone type");
        phone.setType(Phone.PhoneType.valueOf(scnr.nextLine()));

        System.out.println("Phone Number - Enter area code");
        phone.setAreaCode(scnr.nextInt());
        scnr.nextLine();

        System.out.println("Phone Number - Enter prefix");
        phone.setPrefix(scnr.nextInt());
        scnr.nextLine();

        System.out.println("Phone Number - Enter last 4 digits");
        phone.setNumber(scnr.nextInt());
        scnr.nextLine();

        phone.setPrimary(true); // setting the phone number entered to primary
        student.addPhone(phone); // assigning the phone entered to the student

        student.getgNumber();

        // TESTING STUFF
        record.setStudent(student);
        sms.addRecord(record);
        //System.out.println(student); // ************ NEED TO ADD GNUMBER + TRY CATCH BLOCKS ***************
        System.out.println(record.getStudent());
        System.out.println("\n Record List \n");
        System.out.println(sms.getRecordList());
    }

    /**
     * modStudent.  Prompts user for all required information
     * about a student.
     */
    public void modStudent(int gNumber) {
        // need to be able to identify a student by their gNUmber ***********NEED TO FIX
        Student student = sms.findStudent(gNumber);
        System.out.println(student);
    }
}
