package serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {

        try (var oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}

class Person implements Serializable {

    private String name;
    private int age;
    private double height;
    private boolean married;

    Person(String n, int a, double h, boolean m) {

        name = n;
        age = a;
        height = h;
        married = m;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeight() {
        return height;
    }

    boolean getMarried() {
        return married;
    }
}