package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person Bob = new Person("Bob", 12);
        Person Carla = new Person("Carla", 2);
        System.out.println(Bob.getName() + " " + Bob.getAge());


    }
}