import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteDemo {

    public static void main(String args[]) throws Exception{ //this code reads and prints one char at a time
        //byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
        //ByteArrayInputStream bis = new ByteArrayInputStream(b);

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b[] = bos.toByteArray();

        for(byte x:b){
            System.out.println((char)x);
        }

        // String str = new String(bis.readAllBytes());

        // System.out.println(bis.markSupported());
        //bis.close();

        bos.close();
    }
    
}
