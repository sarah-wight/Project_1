package Project1;
import java.util.ArrayList;

public class SMS {
    private ArrayList<Record> record = new ArrayList<Record>();

    public void addRecord(Record r) {
        record.add(r);
    }

    public ArrayList<Record> getRecordList() {
        return record;
    }

    public ArrayList<Record> getTranscript(int gNumber) {
        /*for(Record r : record) {
            if(gNumber == r.getStudent().getgNumber()) {
                record = ;
            }
        }
*/
        return record;
    }

    // added myself - idk if we need
    public Student findStudent(int gNumber) {
        Student student = null;

        for(Record r : record) {
            if(gNumber == r.getStudent().getgNumber()) {
                student = r.getStudent();
            }
        }

        return student;
    }
}
