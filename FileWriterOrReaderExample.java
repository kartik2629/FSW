import java.io.*; 
public class FileWriterOrReaderExample {  
    public static void main(String args[]){    
         try{ 
			//FileWriter
           FileWriter fw=new FileWriter("testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");  

			//FileReader 
	try{ 			
          FileReader fr=new FileReader("testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();
	}catch(Exception e){System.out.println(e);} 		  
	}
}	