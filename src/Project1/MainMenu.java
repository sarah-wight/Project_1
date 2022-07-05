package Project1;
import java.util.Scanner;

/**
 * Main Menu class.
 *
 * This file displays the main menu, student, course, and record menus.
 * It takes user input as a menu selection and displays the appropriate menu
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class MainMenu {
    /**
     * Main.  Allows program to run. Displays the main menu and
     * takes user input that directs to either the student,
     * course, or record menus.
     */
    public static void main(String[] args) {
        // initializing variables
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        int menuChoice = 0;

        // Displaying main menu - move this out of main later
        System.out.println("Main Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Work with Students\n");
        System.out.println("2. Work with Courses\n");
        System.out.println("3. Work with Records\n");
        System.out.println("4. Quit\n");

        userNum = scnr.nextInt(); // takes user input for menu choice

        // different menu displayed based on user input
        switch(userNum) {
            case 1: studentMenu(); // if 1, student menu is displayed
                    break;
            case 2: courseMenu();
                    break;
            case 3: menuChoice = 3;
                    break;
            case 4: menuChoice = 4;
                    break;
            default: menuChoice = 0;
        }

        System.out.println(menuChoice);
    }

    /**
     * displayMain.  Displays the main menu and takes user input that
     * directs to either the student, course, or record menus.
     */
    public static void displayMain() {
        // initializing variables
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        int menuChoice = 0;

        // Displaying main menu - move this out of main later
        System.out.println("Main Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Work with Students\n");
        System.out.println("2. Work with Courses\n");
        System.out.println("3. Work with Records\n");
        System.out.println("4. Quit\n");

        userNum = scnr.nextInt(); // takes user input for menu choice

        // different menu displayed based on user input
        switch(userNum) {
            case 1: studentMenu(); // if 1, student menu is displayed
                break;
            case 2: courseMenu(); // if 2, course menu
                break;
            case 3: menuChoice = 3;
                break;
            case 4: menuChoice = 4;
                break;
            default: menuChoice = 0;
        }

        //System.out.println(menuChoice);
    }

    /**
     * studentMenu.  Displays student menu and takes user input
     * to either add/modify a student or go back to the main menu.
     */
    public static void studentMenu() {
        // initializing variables
        StudentMenu sm = new StudentMenu(); // creating object of the student menu class
        Scanner scnr = new Scanner(System.in); // scanner
        int userNum = 0;
        int menuChoice = 0;

        // Displaying student menu
        System.out.println("Student Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Add a Student\n");
        System.out.println("2. Modify a Student\n");
        System.out.println("3. Go back to Main Menu\n");

        userNum = scnr.nextInt(); // taking user input for menu selection

        // action is based on user input
        switch(userNum) {
            case 1: sm.addStudent(); // if 1, a student will be added
                break;
            case 2: System.out.println("Enter the G Number of the student you would like to modify");
                    sm.modStudent(scnr.nextInt()); // if 2, a student will be modified
                    scnr.nextLine();
                break;
            case 3: displayMain();
                break;
            default: menuChoice = 0;
        }

        //System.out.println(menuChoice);
    }

    /**
     * courseMenu.  Displays course menu and takes user input
     * to either add a course or go back to the main menu.
     */
    public static void courseMenu() {
        // initializing variables
        CourseMenu cm = new CourseMenu(); // creating object of the course menu class
        Scanner scnr = new Scanner(System.in); // scanner
        int userNum = 0;
        int menuChoice = 0;

        // Displaying course menu
        System.out.println("Course Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Add a Course\n");
        System.out.println("2. Go back to Main Menu\n");

        userNum = scnr.nextInt(); // taking user input for menu selection

        // action is based on user input
        switch(userNum) {
            case 1: cm.addCourse(); // if 1, a course will be added
                break;
            case 2: displayMain();
                break;
            default: menuChoice = 0;
        }

        //System.out.println(menuChoice);
    }

    /**
     * recordsMenu.  Displays student menu and takes user input
     * to either add/modify a student or go back to the main menu.
     */
    public static void recordsMenu() {
        // initializing variables
        RecordsMenu rm = new RecordsMenu(); // creating object of the student menu class
        Scanner scnr = new Scanner(System.in); // scanner
        int userNum = 0;
        int menuChoice = 0;

        // Displaying records menu
        System.out.println("Records Menu\n");
        System.out.println("==========\n");
        System.out.println("1. Add a Record\n");
        System.out.println("2. View a transcript for a Student\n");
        System.out.println("3. Save records to a disk\n");
        System.out.println("4. Load records from disk\n");
        System.out.println("5. Return to main menu\n");

        userNum = scnr.nextInt(); // taking user input for menu selection

        // action is based on user input
        switch(userNum) {
            case 1: rm.addRecord(); // if 1, a record will be added
                break;
            case 2: rm.viewTranscript(); // if 2, a transcript will be displayed
                break;
            case 3: rm.saveRecord(); // if 3, the record will be saved to disk
                break;
            case 4: rm.loadRecord(); // if 4, records will be loaded from disk
                break;
            case 5: displayMain(); // if 5, main menu will be displayed
                break;
            default: menuChoice = 0;
        }

        //System.out.println(menuChoice);
    }
}
