package car_driver;

public class Car implements Cloneable {
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
//    public car_driver.Car(car_driver.Car otherCar) throws CloneNotSupportedException {
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
