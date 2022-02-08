package polymorphism.var4;

public class Child2 extends Parent{
    @Override
    public void printX() {
        x = 2;
        System.out.println(x);
    }
}
