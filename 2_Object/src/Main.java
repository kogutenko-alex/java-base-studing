public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
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
        System.out.println("-----------------------------");
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
}

class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person() {
    }

    /**
     * Конструктор копирования.
     *
     * @param otherPerson
     */
    public Person(Person otherPerson) {
        this(otherPerson.getId(), otherPerson.getFirstName(), otherPerson.getLastName());
    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    /*
        Правила, которые следует учесть при переопределении equals:
        Рефлексивность: x.equals(x) == true
        Симметричность: если x.equals(y), тогда y.equals(x) == true
        Переносимость: если x.equals(y) и y.equals(z), тогда x.equals(z) == true
        Консистентность: если x.equals(y), тогда x.equals(y) == true
        Null проверка: x.equals(null) == false
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person guest = (Person) obj;
        return id == guest.id
                && (firstName == guest.firstName
                || (firstName != null && firstName.equals(guest.getFirstName())))
                && (lastName == guest.lastName
                || (lastName != null && lastName .equals(guest.getLastName())
        ));
    }
    /*
    Хеш-код - это целое число,
    генерируемое на основе конкретного объекта.
    Его можно рассматривать как шифр с уникальным значением.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    /*
     Поверхностное клонирование
     */
    @Override
    protected Person clone() throws CloneNotSupportedException {
        return new Person(this.id, this.firstName, this.lastName);
    }

    @Override
    public String toString() {
        return "Person " + getId() + " : " + getFirstName() + " " + getLastName();
    }
}

class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    /**
     * Конструктор копирования.
     *
     * @param otherCar
     */
    public Car(Car otherCar) {
        this(otherCar.getName(), otherCar.getDriver());
    }
//    /**
//     * Конструктор копирования с "глубоким" клонированием
//     *
//     * @param otherCar
//     */
//    public Car(Car otherCar) throws CloneNotSupportedException {
//        this(otherCar.getName(), otherCar.getDriver().clone());
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    /*
      Глубокое клонирование
    */
    @Override
    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Driver driver = this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return name.equals(car.name)
                && (driver == car.driver
                || (driver != null && driver.equals(car.getDriver()))
        );
    }
}

class Driver implements Cloneable {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
    /*
     Поверхностное клонирование
     */
    @Override
    public Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Driver guest = (Driver) obj;
        return age == guest.age
                && (name == guest.name
                || (name != null && name.equals(guest.getName()))
        );
    }

}