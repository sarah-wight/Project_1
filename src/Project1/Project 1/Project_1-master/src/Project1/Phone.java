package Project1;
import java.util.ArrayList;

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
    public Phone(){
        // when we make these constructors do we want to force them to enter the phone type
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
}
