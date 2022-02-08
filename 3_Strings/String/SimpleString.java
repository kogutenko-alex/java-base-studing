package String;

public class SimpleString {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = new String("World");
        System.out.println("str1 + str2                   : " + str1 + str2);
        System.out.println("str1.concat(str2)             : " + str1.concat(str2).concat("!!!"));
        String strHello = str1.concat(str2).concat("!!!");
        System.out.println("length                        : " + strHello.length());
        System.out.println("indexOf(\"e\")                  : " + strHello.indexOf("e"));
        System.out.println("indexOf('o', 5)               : " + strHello.indexOf('o', 5));
        System.out.println("lastIndexOf(\"!\")              : " + strHello.lastIndexOf("!"));
        System.out.println("compareTo(str1 + str2)        : " + strHello.compareTo(str1 + str2));
        System.out.println("toLowerCase()                 : " + strHello.toLowerCase());
        System.out.println("toUpperCase()                 : " + strHello.toUpperCase());
        System.out.println("codePointAt(6)                : " + strHello.codePointAt(5) + "(" + Character.toString(strHello.codePointAt(5)) + ")");
        System.out.println("equals(str1 + str2 + \"!!!\")   : " + strHello.equals(str1 + str2 + "!!!"));

    }
}
