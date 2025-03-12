package ExceptionHandling;

import java.io.*;

class LowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than 5000";
    }
}

public class CheckedUnchecked {
    static void fun1(){
        try{
            throw new LowBalanceException();
            //FileInputStream fi = new FileInputStream("My.txt");
            //System.out.println(10/0);
        }
        catch(Exception e){
            // e.getCause(); returns throwable type
            // e.getMessage(); returns a string
            System.out.println(e.toString());
            //e.printStackTrace();
        }

    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String args[]){
        fun3();
    }
    
}
