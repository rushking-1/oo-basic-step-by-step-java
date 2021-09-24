package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;
    private List<Student> stuList = new ArrayList<Student>();


    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        if(student.getKlass().equals(number)){
            this.leader = student;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Klass(int number) {
        this.number = number;
    }

    public void appendMember(Student student){
        stuList.add(student);
    }
}
