package Interfaces;

interface Test{
    void meth1();
    void meth2();
}

class My implements Test{
    public void meth1(){ //Override Method
        System.out.println("Meth1 My Class");
    }
    public void meth2(){ //Override Method
        System.out.println("Meth2 My Class");
    }
    public void meth3(){ //New Method
        System.out.println("Meth3 My Class");
    }

}

public class InterfacePractice {
    public static void main(String args[]){
        Test t = new My();
        t.meth1();
        t.meth2();
    }
    
}
