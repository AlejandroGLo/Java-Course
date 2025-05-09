package LambdaExpressions;

@FunctionalInterface //There can just be 1 single method
interface MyLambda{
    public void display(); //Single method

}

/*class My implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}*/

public class LambdaDemo {
    public static void main(String args[]){
        MyLambda m = () -> {System.out.println("Hello world");}; // Lambda Exp
        m.display();

    }
    
}
