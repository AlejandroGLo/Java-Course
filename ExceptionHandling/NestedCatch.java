package ExceptionHandling;

public class NestedCatch {
    public static void main(String args[]){
        int A[] = {30,20,10,40,0};

        try{
            int c = A[0]/A[4]; //Exception because cant divide by 0
            System.out.println("Div is " + c);

            try{
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index is Invalid");
            }

            //System.out.println(A[5]); Exception because there is no index 5. Just 0,1,2,3,4 - When one exception arise it will go to catch
            //the rest of the statements in the try wont run.
        }
        catch(ArithmeticException e){
            System.out.println("Denominator Should not be 0");
        }
        System.out.println("Bye");
    }
    
}
