package practice05;

public class Teacher extends Person {
    private int klass = 0;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String tom, int age) {
        super(tom, age);
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String message = super.introduce() + " I am a Teacher. I teach ";
        if (klass == 0) {
            return message + String.format("No Class.");
        }
        return message + String.format("Class %d.", klass);
    }
}
