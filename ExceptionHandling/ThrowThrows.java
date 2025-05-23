package ExceptionHandling;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a Rectangle cannot be negative";
    }
}

public class ThrowThrows {

    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    static void meth1()throws NegativeDimensionException{
            System.out.println("Area is " + area(-10,5));
    }
    public static void main(String args[]) {
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    
}
