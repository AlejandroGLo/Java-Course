/* 
 * Dynamically calling a method. Reference is super class, but the new object is a dynamically created in heap
 * Reference of Super class and object of sub class
 * Overrided method is called
 * Method of a subclass is called
 */

class Super{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub Meth2");
    }
    public void meth3(){
        System.out.println("Sub Meth3");
    }
}

 public class DynamicMethodDispatch {
    public static void main(String args[]){
        /*Super sup = new Super();
        sup.meth1();
        sup.meth2();*/

        Sub sub = new Sub();
        sub.meth1();
        sub.meth2(); //Overrided 
        sub.meth3();

    }

}

