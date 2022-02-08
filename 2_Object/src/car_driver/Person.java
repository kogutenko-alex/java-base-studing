package car_driver;

public class Person {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
                || (lastName != null && lastName.equals(guest.getLastName())
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
        return "car_driver.Person " + getId() + " : " + getFirstName() + " " + getLastName();
    }
}
