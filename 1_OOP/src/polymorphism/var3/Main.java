package polymorphism.var3;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("c.a=" + c.a + " c.b=" + c.b + " c.c=" + c.c); // результатом будет 3
        /*
        Parent p = c;
        System.out.println("p.a=" + p.a);
        */
        System.out.println("p.a=" + ((Parent)c).a); //результатом будет 2

    }
}

