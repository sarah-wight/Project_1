package Project1;
import java.util.ArrayList;
import java.lang.Enum;

/****************CLASS IS WORKING - ADD BUSINESS CONSTRAINTS***********/
public class Phone {
    private int areaCode;
    private int prefix;
    private int number;
    private boolean primary;
    private PhoneType type;

    // where do we ask for type? where do we store this?
    enum PhoneType {
        HOME,
        CELL,
        BUSINESS,
        FAX
    }

    // do we even need this constructor? not in UML
    // probably change and make this blank - just prompt them to set everything?
    public Phone(PhoneType type, int areaCode, int prefix, int number, boolean primary){
        // when we make these constructors do we want to force them to enter the phone type
        this.type = type;
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
        this.primary = primary;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        // maybe a switch statement to set type?
        this.type = type;
    }

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String toString() {
        return this.type + ": (" + areaCode + ") " + prefix + "-" + number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(PhoneType.BUSINESS, 810, 294, 9817, true);
        System.out.println(phone1);
    }
}
