package inheritance.var2;

public class Manager extends Employee {
    private final double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * (100 + bonus) / 100;
    }

}
