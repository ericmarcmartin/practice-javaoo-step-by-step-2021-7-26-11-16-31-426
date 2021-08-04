package practice04;

import practice02.Person;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class "
                + getKlass() + ".";
    }
}
