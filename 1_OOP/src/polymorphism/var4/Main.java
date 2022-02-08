package polymorphism.var4;

public class Main {
    public static void main(String[] args) {
        new Child().printX(); //0
    }
}

class Parent {
    int x = 0;
    public void printX() {
        System.out.println(x);
    }
}

class Child extends Parent {
    int x = -1;
}