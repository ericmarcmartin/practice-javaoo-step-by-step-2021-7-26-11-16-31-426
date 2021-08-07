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
        return equals(this.klass.getLeader()) ?
                String.format("%s I am a Student. I am Leader of Class %d.", super.introduce(), klass.getNumber()) :
                String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass.getNumber());
    }
}
