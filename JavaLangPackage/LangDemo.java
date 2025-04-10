package JavaLangPackage;

import java.lang.*;

class MyObject{
    public String toString(){
        return "My Object";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
// class MyObject2 extends MyObject{

// }

public class LangDemo {
    public static void main(String args[]){
        // Object o1 = new Object();
        // Object o2=o1;
        // System.out.println(o1.equals(o2));

        // MyObject o2 = new MyObject();
        // o2.equals(o2);
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1.equals(o2));



    }
    
}
