import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SaveFile {
    public static void main(String args[]) throws Exception{
        FileInputStream fis1 = new FileInputStream("Source1.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");

        FileOutputStream fos = new FileOutputStream("Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while((b=sis.read())!=-1){ //read and store the data in b
                fos.write(b);
            
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();
        }


    }
    
