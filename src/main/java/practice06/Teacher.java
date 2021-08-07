package practice06;

public class Teacher extends Person {
    private Klass klass;
    private final String TEACH = "teach ";
    private final String DONT_TEACH = "don't teach ";
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
            return teachNoClass();
        }
        return doTeach(klass.getDisplayName());
    }

    private boolean klassDoesNotMatchWithTeacher() {
        return klass == null;
    }

    private String doTeach(String displayName) {
        return message + TEACH + displayName + ".";
    }

    private String teachNoClass() {
        return message + TEACH + "No Class.";
    }

    public String introduceWith(Student student) {
        return isTeacherSameKlassWith(student) ?
                doTeach(student.getName()) :
                doNotTeach(student);
    }

    private String doNotTeach(Student student) {
        return message + DONT_TEACH + student.getName() + ".";
    }

    private boolean isTeacherSameKlassWith(Student student) {
        return student.getKlass().getNumber() == klass.getNumber();
    }
}
