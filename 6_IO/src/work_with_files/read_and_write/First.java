package work_with_files.read_and_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class First {
    private static final String PATH = System.getProperty("user.dir");

    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fos = null;

        String text = "Hello world!"; // строка для записи

        try {
            fos = new FileOutputStream(PATH + "/input1.txt");
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("The file has been written");

        try {
            fin = new FileInputStream(PATH + "/input1.txt");
            System.out.printf("File size: %d bytes \n", fin.available());
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {

            try {

                if (fin != null)
                    fin.close();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

        try {
            fin = new FileInputStream(PATH + "/input1.txt");
            fos = new FileOutputStream(PATH + "/input1-new.txt");
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
            System.out.println("\nFile rewrite");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {

            try {
                if (fos != null)
                    fos.close();
                if (fin != null)
                    fin.close();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

    }
}
