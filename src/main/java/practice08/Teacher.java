package practice08;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    @Override
    public String introduce() {
        if (this.klass != null)
            return super.introduce()+" I am a Teacher. I teach Class 2.";
        else
            return super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduceWith(Student stu) {
        if (this.klass == stu.getKlass()){
            return super.introduce()+" I am a Teacher. I teach "+stu.getName()+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+stu.getName()+".";
        }
    }
}
