package LambdaExpressions;

interface MyLambda{
    public void display(String str);
}

public class LambdaDemo3 {

    public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.err.println(sb);
    }
    public static void main(String args[]){
        MyLambda ml = System.out::println; //scope resolution
        MyLambda mlr = LambdaDemo3::reverse; //calling methods basically
        LambdaDemo3 ld = new LambdaDemo3();
        //MyLambda ml3 = ld::reverse;

        ml.display("Hello");
        mlr.display("Hello");
        //ml3.display("Hello");

    }
    
}
