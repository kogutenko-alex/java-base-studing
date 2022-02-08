package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person Bob = new Person("Bob", 12);
        Person Carla = new Person("Carla", 2);
        System.out.println(Bob.getName() + " " + Bob.getAge());


    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if(age <= 0) throw new IllegalArgumentException("Age should be positive!");
        else this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0) throw new IllegalArgumentException("Age should be positive!");
        this.age = age;
    }
}