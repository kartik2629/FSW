import java.io.*;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try {
            // Writing to a ByteArrayOutputStream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write("Hello, ByteArrayOutputStream!".getBytes());
            // Converting to a byte array
            byte[] byteArray = baos.toByteArray();
            // Printing the content
            System.out.println(new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}