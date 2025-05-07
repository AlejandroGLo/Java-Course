package JavaDoc;

import java.util.*;

class Parent{
    public void display(){}
}

class Child extends Parent{
    @Override
    public void display(){

    }
}

class OldClass{
    public void display(){
        System.out.println("Hello");
    }

    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

public class AnnotationDemo {
    static List l;
    //@SuppressWarnings("deprecation")
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        l.add(10);
        OldClass oc = new OldClass();
        oc.show();

    }
    
}
