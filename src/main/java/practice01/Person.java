package practice01;

public class Person {
    private String name;   
    private int age;


    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String introduce() {
        return  "My name is "+ getName()+ ". I am "+ getAge()+" years old.";
    }
}
