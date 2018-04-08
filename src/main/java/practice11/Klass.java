package practice11;

import java.util.LinkedList;

public class Klass {
    private Integer number;
    private Student leader;
    private LinkedList<Teacher> teachers = new LinkedList<>();

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
        this.teachers.forEach(teacher -> teacher.studentBecomeLeader(stu, this));
    }

    public void appendMember(Student stu){
        //stu.getKlass().setNumber(this.number);
        stu.setKlass(this);
        this.teachers.forEach(teacher -> teacher.studentJoinClass(stu, this));
    }
    public boolean isIn(Student student){
       return student.getKlass().equals(this);
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
}
