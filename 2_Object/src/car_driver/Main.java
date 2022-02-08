package car_driver;

import car_driver.Car;
import car_driver.Driver;
import car_driver.Person;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        persons();
        System.out.println("-----------------------------");
        cars();
    }

    private static void cars() throws CloneNotSupportedException {
        Car car1 = new Car("Ford", new Driver("Bob", 18));
        Car car2 = new Car(car1);
        Car car3 = car2.clone();
        System.out.println("c1 : c2 = " + car1.equals(car2));
        System.out.println("c2 : c3 = " + car2.equals(car3));
        System.out.println("c1 : c3 = " + car1.equals(car3));
        car1.setName("Lada");
        System.out.println("c1 : c2 = " + car1.equals(car2));
        System.out.println("c2 : c3 = " + car2.equals(car3));
        System.out.println("c1 : c3 = " + car1.equals(car3));
    }

    private static void persons() throws CloneNotSupportedException {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = person1.clone();
        Person person3 = new Person(person2);
        System.out.println("p1 : p2 = " + person1.equals(person2));
        System.out.println("p2 : p3 = " + person2.equals(person3));
        System.out.println("p1 : p3 = " + person1.equals(person3));
        person1.setFirstName("Oleg");
        System.out.println("p1: " + person1.getFirstName());
        System.out.println("p1 : p2 = " + person1.equals(person2));
        System.out.println("p2 : p3 = " + person2.equals(person3));
        System.out.println("p1 : p3 = " + person1.equals(person3));
        System.out.println("p1 hash : p2 hash = " + (person1.hashCode() == person2.hashCode()));
    }
}

