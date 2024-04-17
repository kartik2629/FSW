import java.io.*;  
public class WriterOrReaderExample {  
    public static void main(String[] args) {  
        try {  
			System.out.println("Writer"); 
            Writer w = new FileWriter("output.txt");  
            String content = "I love my country";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 

		System.out.println("Reader"); 
		 try {  
            Reader reader = new FileReader("output.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  	
    }  
} 
