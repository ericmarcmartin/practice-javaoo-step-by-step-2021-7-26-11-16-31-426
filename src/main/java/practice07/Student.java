package practice07;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        String klassDisplayName = klass.getDisplayName();
        String I_AM_STUDENT = " I am a Student. I am";
        if (this.klass.getLeader() != null) {
            return super.introduce() + String.format("%s Leader of %s.", I_AM_STUDENT, klassDisplayName);
        }
        return super.introduce() + String.format("%s at %s.", I_AM_STUDENT, klassDisplayName);
    }
}
