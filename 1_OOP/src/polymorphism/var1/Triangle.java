package polymorphism.var1;

public class Triangle extends Shape {

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfPerimeter = (this.a + this.b + this.c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
    }
}
