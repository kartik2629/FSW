import java.io.*;

public class BufferedStreamsExample {
    public static void main(String[] args) throws IOException {
        // BufferedOutputStream example
        OutputStream os = new BufferedOutputStream(new FileOutputStream("output.txt"));
        os.write("Hello, BufferedOutputStream!".getBytes());
        os.close();

        // BufferedInputStream example
        InputStream is = new BufferedInputStream(new FileInputStream("output.txt"));
        int data;
        while ((data = is.read()) != -1) {
            System.out.print((char) data);
        }
        is.close();
    }
}
