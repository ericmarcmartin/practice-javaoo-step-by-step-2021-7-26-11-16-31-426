package practice07;

public class Teacher extends Person {
    private final Klass klass;
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        return super.introduce() + String.format(" I am a Teacher. I teach %s.", klass.getDisplayName());
    }
}
