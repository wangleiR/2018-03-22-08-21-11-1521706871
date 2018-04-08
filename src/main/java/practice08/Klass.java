package practice08;

public class Klass {
    private Integer number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getDisplayName(){
        return "Class 2";
    }

    public void assignLeader(Student stu){
        this.leader = stu;
    }
}
