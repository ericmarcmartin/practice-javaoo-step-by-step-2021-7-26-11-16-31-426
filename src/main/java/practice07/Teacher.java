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
        String I_AM_A_TEACHER = "I am a Teacher. I teach";
        return klass == null ?
                String.format("%s %s No Class.", super.introduce(), I_AM_A_TEACHER) :
                String.format("%s %s %s.", super.introduce(), I_AM_A_TEACHER, klass.getDisplayName());
    }

    public String introduceWith(Student jerry) {
        return null;
    }
}
