import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedDemo {
    public static void main(String args[])throws Exception {
        //FileInputStream fis = new FileInputStream("C/:MyJava/Test.txt");
        FileReader fis = new FileReader("C/:MyJava/Test.txt");
        //BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedReader bis = new BufferedReader(fis);

        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        bis.mark(10);
        System.out.println(bis.read());
        System.out.println(bis.read());
        bis.reset();
        System.out.println(bis.read());
        System.out.println(bis.read());

        System.out.println("File " +fis.markSupported()); //false not supported
        System.out.println("Buffer " +bis.markSupported()); //true is supported


        System.out.println("String "+bis.readLine());

    }
}
    

