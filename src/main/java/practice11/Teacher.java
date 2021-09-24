package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private int number;
    private String name;
    private int age;
    private Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(int number, String name, int age, LinkedList<Klass> classes) {
        super(number,name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Teacher(int number, String name, int age) {
        super(number,name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass != null){
            return super.introduce()+" I am a Teacher. I teach Class "+ klass.getNumber() +".";
        }

        return super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(student.getKlass().equals(klass)){
            return "My name is "+ name +". I am "+ age +" years old. I am a Teacher. I teach "+ student.getName() +".";
        }
        return "My name is "+ name +". I am "+ age +" years old. I am a Teacher. I don't teach "+ student.getName() +".";
    }

    public Boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.equals(student.getKlass())) {
                return true;
            }
        }
        return false;
    }
}
