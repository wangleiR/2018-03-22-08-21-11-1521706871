package practice10;


import java.util.HashSet;
import java.util.stream.Collectors;

public class Teacher extends Person {
    Klass klass;
    private HashSet<Klass> classes= new HashSet<>();;

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.classes.size() == 0 ? "No Class" : this.classesName()) + ".";
    }
    private String classesName() {
        StringBuilder sb = new StringBuilder("Class ");
        this.classes.forEach(klass -> sb.append(klass.getNumber() + ", "));
        return sb.substring(0, sb.length() - 2);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduceWith(Student stu) {
        return super.introduce()+" I am a Teacher. I"+(isTeaching(stu) ?"":" don't")+" teach "+stu.getName()+".";
    }

    public boolean isTeaching(Student stu){
        return this.classes.stream().filter(s->s.isIn(stu)).collect(Collectors.toList()).size() > 0;
    }
}
