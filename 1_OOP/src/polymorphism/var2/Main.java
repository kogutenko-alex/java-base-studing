package polymorphism.var2;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.a); // результатом будет 3
        /*
        Parent p = c;
        System.out.println(p.a);
         */
        System.out.println(((Parent)c).a); //результатом будет 2
    }
}

