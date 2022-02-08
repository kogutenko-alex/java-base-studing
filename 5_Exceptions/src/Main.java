public class Main {
    public static void main(String[] args) {
        int catNumber;
        int zero;

        try { // мониторим код
            catNumber = 1; // у меня один кот
            zero = 0; // ноль, он и в Африке ноль
            int result = catNumber / zero;
        } catch (ArithmeticException e) {
            System.err.println("INCORRECT div on zero");
        }
    }
}
