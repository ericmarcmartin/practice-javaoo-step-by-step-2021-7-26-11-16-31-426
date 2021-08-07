package practice07;

public class Student extends Person{
    private final Klass klass;
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce(){
        return super.introduce() + String.format(" I am a Student. I am at %s.", klass.getDisplayName());
    }
}
