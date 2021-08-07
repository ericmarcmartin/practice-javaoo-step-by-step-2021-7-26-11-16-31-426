package practice07;

public class Person {
    private final String name;
    private final int age;
    private final int klass;

    public Person(int klass, String name, int age) {
        this.klass = klass;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKlass() {
        return klass;
    }
}
