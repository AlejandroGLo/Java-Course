package ExceptionHandling;

import java.io.*;
import java.util.*;

public class ResourcesDemo {
    static FileInputStream fi;
    static void Divide() throws Exception{

        try(FileInputStream fi=new FileInputStream("path");Scanner sc = new Scanner(fi);){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
    
            System.out.println(a/b);
        }

    }
    public static void main(String args[]) throws Exception{
        try{
            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
        //int x=sc.nextInt();
        System.out.println(x);
    }
    
}
