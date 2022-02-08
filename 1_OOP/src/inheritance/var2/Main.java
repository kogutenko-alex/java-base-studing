package inheritance.var2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob" , 1000);
        Manager manager = new Manager("Stave", 1200, 20);
        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() * (100 + bonus) / 100;
    }

}
