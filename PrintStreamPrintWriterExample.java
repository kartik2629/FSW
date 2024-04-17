import java.io.*;
public class PrintStreamPrintWriterExample {
 public static void main(String[] args) throws FileNotFoundException {
 // PrintStream example (standard output)
 System.out.println("Hello from PrintStream (standard output)");
 PrintStream fileOut = new PrintStream(new FileOutputStream("output.txt"));
 System.setOut(fileOut); // Redirect standard output to file (optional)
 // PrintWriter example (file output)
 PrintWriter writer = new PrintWriter("data.txt");
 writer.println("Hello from PrintWriter (file output)");
 writer.println("This is some additional data.");
 writer.close();
 System.out.println("Data written to files. Standard output restored."); // If redirected
 }
}