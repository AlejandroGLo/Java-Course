package LambdaExpressions;

interface MyLambda {
    public void display();
}

class UseLambda{
    public void callLambda (MyLambda ml){
        ml.display();
    }
}

class Demo{

    //int temp = 10;
    public void method1(){
    //     int count=0; //Lambda expression can have an use local variables
    //     MyLambda ml=()->{System.out.println("Hi");
    //     System.out.println("Bye" +count+temp); //can access temp even tho its outside of the method
    //     //If we wanna modify variables, they have to be final (if they are local) or instace variables
    //     //Lambda exp can be passed as a method/object
    // };

    // ml.display();


    UseLambda ul = new UseLambda();
    ul.callLambda(()->{System.out.println("Hello");});
    }
}


public class LambdaDemo2 {
    public static void main(String args[]){
        Demo d = new Demo();
        d.method1();
    }
    
}
