package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private final List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student member) {
        this.members.add(member);
    }
}
