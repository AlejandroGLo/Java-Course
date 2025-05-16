import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String args[]) throws Exception {
        try{
            FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.txt");
            String str = "Learn Java Programming";
            
            fos.write(str.getBytes());
            
            fos.close();
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        try{
            FileInputStream fis = new FileInputStream("C:/MyJava/Test.txt");

            byte b [] = new byte[fis.available()];
            fis.read(b);
            
            String str = new String(b);

            System.out.println(str);
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
    
}
