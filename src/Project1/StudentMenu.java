package Project1;

import java.util.Scanner;

/*********************************************************
 * Student Menu class.
 *
 * This file creates a new student or modifies an existing student
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/11/2022
 *
 ********************************************************/
public class StudentMenu {
    private Scanner scnr = new Scanner(System.in);

    // Creating a new student and address - might not need these
    private Student student = new Student();
    private Address address = new Address();
    private Phone phone = new Phone();
    private Record record = new Record(); // idk if we need
    private SMS sms = new SMS();
    private boolean valid = false;

    /*********************************************************
     * addStudent.  Prompts user for all required information
     * about a student.
     ********************************************************/
    // add try catch in here
    public void addStudent() {

        // creating new student, address, phone
        Student student = new Student();
        Address address = new Address();
        Phone phone = new Phone();


        // Prompting user to enter student first name
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter student's first name");
                student.setFirstName(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter student last name
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter student's last name");
                student.setLastName(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address info
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter number");
                address.setNumber(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line in the stream
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address street name
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter street name");
                address.setStreet(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address city
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter city");
                address.setCity(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address state
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter state");
                address.setState(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter MAILING address zipcode
        valid = false;
        while(!valid) {
            try {
                System.out.println("Mailing Address - Enter zipcode");
                address.setZip(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        student.setMailingAddr(address); // setting the address entered as the mailing address

        // Prompting user to enter BILLING address number
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter number");
                address.setNumber(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address name
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter street name");
                address.setStreet(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address city
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter city");
                address.setCity(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address state
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter state");
                address.setState(scnr.nextLine());
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter BILLING address zipcode
        valid = false;
        while(!valid) {
            try {
                System.out.println("Billing Address - Enter zipcode");
                address.setZip(scnr.nextInt());
                scnr.nextLine(); // need this after nextInt() call to get the new line
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        student.setBillingAddr(address); // setting the address entered as the billing address

        // Prompting user to enter PHONE NUMBER type
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter phone type\n HOME, CELL, BUSINESS, or FAX");
                phone.setType(Phone.PhoneType.valueOf(scnr.nextLine()));
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter PHONE NUMBER area code
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter area code");
                phone.setAreaCode(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter PHONE NUMBER prefix
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter prefix");
                phone.setPrefix(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        // Prompting user to enter PHONE NUMBER last 4 digits
        valid = false;
        while(!valid) {
            try {
                System.out.println("Phone Number - Enter last 4 digits");
                phone.setNumber(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        phone.setPrimary(true); // setting the phone number entered to primary
        student.addPhone(phone); // assigning the phone entered to the student

        //student.getgNumber(); // getting the gnumber - do we get or set?

        // Prompting user to enter gnumber
        valid = false;
        while(!valid) {
            try {
                System.out.println("Enter new student G Number");
                student.setgNumber(scnr.nextInt());
                scnr.nextLine();
                valid = true;
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Please try again\n");
            }
        }

        sms.addS(student); // adding new student to the list of students

        System.out.println(student); // ************ NEED TO ADD GNUMBER + TRY CATCH BLOCKS ***************
        System.out.println("\n");
    }

    /*********************************************************
     * modStudent.  Prompts user for all required information
     * about a student.
     ********************************************************/
    public void modStudent() {
        // need to be able to identify a student by their gNUmber ***********NEED TO FIX
        System.out.println("Please enter the G Number of the student you would like to modify\n");

        //scnr.nextInt();

        sms.printS();
        System.out.println("Print done");

        /*Student student = sms.findStudent(gNumber);
        System.out.println(student);*/
    }
}
