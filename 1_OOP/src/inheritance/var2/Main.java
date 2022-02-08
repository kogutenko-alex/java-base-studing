package inheritance.var2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob" , 1000);
        Manager manager = new Manager("Stave", 1200, 20);
        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());
    }
}

