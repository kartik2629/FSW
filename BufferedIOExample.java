import java.io.*;

public class BufferedIOExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using BufferedOutputStream
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_output.txt"));
            bos.write("Hello, BufferedOutputStream!".getBytes());
            bos.close();
            // Reading from a file using BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("buffered_output.txt"));
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}