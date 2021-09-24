package practice10;

public class Student extends Person {
    private int number;
    private String name;
    private int age;
    private Klass klass;

    public Student(int number, String name, int age, Klass klass) {
        super(1,"Tom" ,21);
        this.number = number;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class "+ klass +".";
    }
}