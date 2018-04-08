package practice11;

public class Person {
    private String name;
    private int age;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id,String name,int age) {
            this.age = age;
            this.id = id;
            this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    @Override
    public boolean equals(Object obj) {
        // 如果为同一对象的不同引用,则相同
        if (this == obj) {
            return true;
        }
        // 如果传入的对象为空,则返回false
        if (obj == null) {
            return false;
        }

        // 如果两者属于不同的类型,不能相等
        if (getClass() != obj.getClass()) {
            return false;
        }

        // 类型相同, 比较内容是否相同
        Person other = (Person) obj;
        return this.age == other.getAge()&&
                this.name.equals(other.getName())&&this.id == other.getId();

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
