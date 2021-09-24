package practice08;

public class Klass {
    private int number;
    private Teacher leader;
    private String DisplayName;


    public Teacher getLeader() {
        return leader;
    }

    public void assignLeader(Teacher teacher){
        if(teacher.getKlass().equals(number)){
            this.leader = teacher;
        }
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

}
