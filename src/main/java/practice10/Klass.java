package practice10;

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
        if (stu.getKlass() != this){
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = stu;
    }

    public void appendMember(Student stu){
        stu.getKlass().setNumber(this.number);
    }
    public boolean isIn(Student student){
        if (student.getKlass() != this){
            return false;
        }
        return true;
    }
}
