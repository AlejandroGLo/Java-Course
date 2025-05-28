import java.util.*;
import java.io.*;

public class PropertyDemo { //In properties we can only do Strings
    public static void main(String args[]){
        Properties p = new Properties(); //key , value
        p.setProperty("Brand", "Apple");
        p.setProperty("Processor", "M2");
        p.setProperty("Device", "Mac");
        p.setProperty("Model", "Pro");

        System.out.println(p);

        //p.store("path", "Laptop");
    }
    
}
