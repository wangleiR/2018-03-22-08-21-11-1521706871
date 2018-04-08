package practice10;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (!student.getKlass().equals(this)) {
            System.out.println("It is not one of us.");
            return;
        }
        this.leader = student;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }
}
