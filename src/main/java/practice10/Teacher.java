package practice10;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private HashSet<Klass> classes = new HashSet<>();

    Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    Teacher(int id, String name, int age, HashSet<Klass> classes) {
        this(id, name, age);
        this.classes = classes;
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    private String classesName() {
        StringBuilder sb = new StringBuilder("Class ");
        this.classes.forEach(klass -> sb.append(klass.getNumber() + ", "));
        return sb.substring(0, sb.length() - 2);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.classes.size() == 0 ? "No Class" : this.classesName()) + ".";
    }

    public String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. I" + (this.isTeaching(student)? " ": " don't ") + "teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return this.classes.stream().filter(klass -> klass.isIn(student)).collect(Collectors.toSet()).size() > 0;
    }
}
