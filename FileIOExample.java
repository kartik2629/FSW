import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using FileOutputStream
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write("Hello, FileOutputStream!".getBytes());
            fos.close();
            // Reading from a file using FileInputStream
            FileInputStream fis = new FileInputStream("output.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}