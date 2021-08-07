package practice09;


public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        String MESSAGE = super.introduce()+" I am a Student. I am";
        return String.format("%s at Class %d.", MESSAGE, klass.getNumber());
    }
}
