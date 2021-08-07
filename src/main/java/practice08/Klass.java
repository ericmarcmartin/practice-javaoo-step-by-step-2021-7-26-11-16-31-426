package practice08;

public class Klass {
    private final int number;

    public Klass(int number) {

        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }
}
