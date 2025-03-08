package InnerClasses;

abstract class My{
    abstract public void show();
}

class Outer{

    public void display(){
        /*class Inner{
            public void show(){
                System.out.println("Hello");
            }
        }

        new Inner().show();*/
        new My(){ //anonymous class
            public void show(){
                System.out.println("Hi");
            }
        }.show();
        
    }

}

public class LocalInner {
    public static void main(String args[]){
        Outer o = new Outer();
        o.display();

    }
    
}
