package practice07;

public class Klass {
    private final int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public String assignLeader(Student leader) {
       return null;
    }

    public String getLeader() {
        return null;
    }
}
