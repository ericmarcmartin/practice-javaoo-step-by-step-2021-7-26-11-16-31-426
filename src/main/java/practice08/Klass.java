package practice08;

public class Klass {
    private final int number;
    private Student leader;

    public Klass(int number) {

        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student leader) {
        System.out.print("It is not one of us.\n");
    }

    public Student getLeader() {
        return null;
    }
}
