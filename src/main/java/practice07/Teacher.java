package practice07;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String teacher, int age) {
        super(id, teacher, age);
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + String.format(" I am a Teacher. I teach %s.", klass.getDisplayName());
    }
}
