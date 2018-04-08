package practice06;

public class Student  extends Person {
    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class 2.";
    }


}