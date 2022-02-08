package byteArray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class First {
    public static void main(String[] args) {

        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {

            System.out.println(b);
        }

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {
            System.out.print((char) c);
        }
        System.out.println("\n\n-----------\n\n");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text1 = "Hello Wolrd!";
        byte[] buffer = text1.getBytes();
        try {
            baos.write(buffer);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        // превращаем массив байтов в строку
        System.out.println(baos.toString());

        // получаем массив байтов и выводим по символьно
        byte[] array = baos.toByteArray();
        for (byte b1 : array) {

            System.out.print((char) b1);
        }
        System.out.println();

    }
}
