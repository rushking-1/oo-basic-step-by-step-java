package practice11;

public class Person {
    private int number;
    private String name;
    private int age;

    public Person(int number,String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+ name +". I am " + age + " years old.";
    }
}