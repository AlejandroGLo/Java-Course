package LambdaExpressions;

@FunctionalInterface //There can just be 1 single method
interface MyLambda{
    //public void display(String str); //Single method

    public int add(int x, int y);

}

/*class My implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}*/

public class LambdaDemo {
    public static void main(String args[]){
        //MyLambda m = (s) -> {System.out.println(s);}; // Lambda Expression (arrow)
        //MyLambda m = (a,b) -> {return a+b;};
        MyLambda m =(a,b)->a+b;
        int r =m.add(20,30);

        System.out.println(r);

        //m.display("Hello World"); //This hello world is passed to "s" and the lambda expression prints it

    }
    
}
