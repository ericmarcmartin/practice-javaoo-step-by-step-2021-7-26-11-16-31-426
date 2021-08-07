package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return klass != null ?
                String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass.getNumber()) :
                String.format("%s I am a Teacher. I teach No Class.", super.introduce());
    }

    public String introduceWith(Student member) {
        return this.klass.getNumber() == member.getKlass().getNumber() ?
                String.format("%s I am a Teacher. I teach %s.", super.introduce(), member.getName()) :
                String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), member.getName());
    }
}