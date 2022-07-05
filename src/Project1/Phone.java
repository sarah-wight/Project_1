package Project1;
import java.util.ArrayList;
import java.lang.Enum;

/**
 * Phone class.
 *
 * This file contains and edits the phone numbers.
 * @author Sarah Wight, Zack Peters, Mike Rosin
 * @date 7/6/2022
 *
 */
public class Phone {
    private int areaCode;
    private int prefix;
    private int number;
    private boolean primary;
    private PhoneType type;

    /**
     * PhoneType.  Enumeration class that sets the phone number type.
     */
    enum PhoneType {
        HOME,
        CELL,
        BUSINESS,
        FAX
    }

    // do we even need this constructor? not in UML
    // probably change and make this blank - just prompt them to set everything?
    /**
     * Constructor.  Sets base state of a Phone object to the
     * values passed in.
     */
    public Phone(){
        // when we make these constructors do we want to force them to enter the phone type
        //Phone phone = new Phone();
    }

    /**
     * getAreaCode.  Returns an int with the phone number's area code.
     * @return int
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * setAreaCode.  Sets the phone number's area code.
     * @int areaCode.
     */
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * getPrefix.  Returns an int with the prefix of the phone number.
     * @return int
     */
    public int getPrefix() {
        return prefix;
    }

    /**
     * setPrefix.  Sets the phone number's prefix.
     * @int prefix.
     */
    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    /**
     * getNumber.  Returns an int with the last 4 digits of the phone number.
     * @return int
     */
    public int getNumber() {
        return number;
    }

    /**
     * setNumber.  Sets the phone number's last four digits.
     * @int number.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getType.  Returns a PhoneType with the type of phone number.
     * @return PhoneType
     */
    public PhoneType getType() {
        return type;
    }

    /**
     * setType.  Sets the phone number's type to home, cell, business, fax.
     * @int areaCode.
     */
    public void setType(PhoneType type) {
        // maybe a switch statement to set type?
        this.type = type;
    }

    /**
     * getPrimary.  Returns a boolean confirming if the phone number is primary.
     * @return boolean
     */
    public boolean getPrimary() {
        return primary;
    }

    /**
     * setPrimary.  Sets the phone number as primary.
     * @boolean primary.
     */
    public void setPrimary(boolean primary) {
        if(primary) {
            this.primary = primary;
        }
    }

    /**
     * toString.  Returns a formatted String with the phone number.
     * @return String
     */
    public String toString() {
        return this.type + ": (" + areaCode + ") " + prefix + "-" + number;
    }

}
