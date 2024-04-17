import java.io.*;
public class CharArrayReaderWriterExample {
 public static void main(String[] args) {
 char[] data = "This is some data to be written to a CharArrayWriter.".toCharArray();
 // Create a CharArrayReader
 CharArrayReader reader = new CharArrayReader(data);
 // Create a CharArrayWriter
 CharArrayWriter writer = new CharArrayWriter();
 // Read from CharArrayReader and write to CharArrayWriter
 int ch;
 try {
 while ((ch = reader.read()) != -1) {
 writer.write(ch);
 }
 } catch (IOException e) {e.printStackTrace();
 }
 // Get the written data as a String
  try {
 String writtenContent = writer.toString();
 System.out.println("Original data: " + new String(data));
 System.out.println("Written data: " + writtenContent);
 reader.close();

 writer.close();
 }catch(Exception e){System.out.println(e);}
 }
}
