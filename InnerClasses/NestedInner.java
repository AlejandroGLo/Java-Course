package InnerClasses;

class Outer{
    static int x=10; //static members can also be directly accessible 
    Inner i = new Inner();

    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x+ " " + y);
        }
    }

    public void outerDisplay(){
        //Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y); /*value y in the inner class is accessible by the outer class 
        through inner class object (referencing it)*/
    }
}

public class NestedInner {
    public static void main(String args[]){
        /*Outer o = new Outer();
        o.outerDisplay();*/
        Outer.Inner oi = new Outer().new Inner();
        /*We can access the Inner class inside the method method 
        (we first need to create an object of outer, then inner to access it)*/
    }
    
}
