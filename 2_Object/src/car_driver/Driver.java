package car_driver;

public class Driver implements Cloneable {
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
