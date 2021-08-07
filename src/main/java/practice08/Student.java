package practice08;

public class Student extends Person {
    private Klass klass;

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
        return equals(this.klass.getLeader()) ?
                String.format("%s Leader of Class %d.", MESSAGE, klass.getNumber()) :
                String.format("%s at Class %d.", MESSAGE, klass.getNumber());
    }
}
