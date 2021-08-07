package practice09;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;
    String MESSAGE = super.introduce() + " I am a Teacher. I";

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (classes == null) {

            return String.format("%s teach No Class.", MESSAGE);
        } else if (classes.size() > 1) {

            return generateClasses();
        }

        return String.format("%s teach Class %d.", MESSAGE, classes.getFirst().getNumber());
    }

    private String generateClasses() {
        String classes = "";
        for (Klass klass : this.classes) {
            classes = getClasses(classes, klass);
        }

        return String.format("%s teach Class %s.", MESSAGE, classes);
    }

    private String getClasses(String classes, Klass klass) {
        int klassNumber = klass.getNumber();
        if (this.classes.getFirst().equals(klass)) {
            classes = String.format("%s", klassNumber);
        } else {
            classes = String.format("%s, %s", classes, klassNumber);
        }

        return classes;
    }

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        String studentName = student.getName();
        return isTeacherSameClassWith(student) ?
                String.format("%s teach %s.", MESSAGE, studentName) :
                String.format("%s don't teach %s.", MESSAGE, studentName);
    }

    private boolean isTeacherSameClassWith(Student student) {
        return classes.getFirst().getNumber() == (student.getKlass().getNumber());
    }
}
