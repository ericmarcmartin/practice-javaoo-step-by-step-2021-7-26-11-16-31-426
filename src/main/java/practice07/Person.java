package practice07;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && klass == person.klass && Objects.equals(name, person.name);
    }
}
