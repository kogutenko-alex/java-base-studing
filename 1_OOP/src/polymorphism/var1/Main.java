package polymorphism.var1;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(10, 10, 10);
        System.out.println("Square of the rectangle is " + r.area());
        System.out.println("Square of the triangle is " + t.area());
    }
}

