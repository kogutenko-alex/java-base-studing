package polymorphism.var3;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("c.a=" + c.a + " c.b=" + c.b + " c.c=" + c.c); // результатом будет 3
        Parent p = c;
        System.out.println("p.a=" + p.a); //результатом будет 2
    }
}

class Parent {
    int a = 2;
}

class Child extends Parent {
    int a = 3;                     //скрывающее объявление
    int b = ((Parent)this).a;      //громоздкое обращение к родительскому полю
    int c = super.a;               //простое обращение к родительскому полю
}