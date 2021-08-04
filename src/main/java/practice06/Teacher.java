package practice06;

public class Teacher extends Person {
    private Klass klass;
    private final String TEACH = "teach ";
    String message = super.introduce() + " I am a Teacher. I ";

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klassDoesNotMatchWithTeacher()) {
            Klass klass = new Klass(0);
            return doNotTeach(klass);
        }
        return doTeach(klass.getDisplayName());
    }

    private boolean klassDoesNotMatchWithTeacher() {
        return klass == null;
    }

    private String doTeach(String displayName) {
        return message + TEACH + displayName + ".";
    }

    private String doNotTeach(Klass klass) {
        return message + TEACH + klass.getDisplayName();
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() != klass.getNumber()) {
            return message + "don't " + TEACH + student.getName() + ".";
        }
        return doTeach(student.getName());
    }
}
