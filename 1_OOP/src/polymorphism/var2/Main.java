package polymorphism.var2;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.a); // результатом будет 3
        Parent p = c;
        System.out.println(p.a); //результатом будет 2
    }
}

class Parent {
    int a = 2;
}

class Child extends Parent {
    int a = 3;
}