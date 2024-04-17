import java.io.*;  
public class FilterIO {  
    public static void main(String[] args) throws IOException {  
        System.out.println("FilterOutputStream"); 
		File data = new File("ABC.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to java";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success");  
		
		System.out.println("FilterInputputStream"); 
		try{    
            FileInputStream fin=new FileInputStream("ABC.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}      
    }  
}
