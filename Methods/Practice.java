package Methods;

public class Practice {

    static void change(int A[], int index, int value){ // We can also change A for X and it will do the same because it references the same array
        A[index] = value;
    }

    static void change2(int x, int value){ // We can also change A for X and it will do the same because it references the same array
        x = value;
    }
    public static void main(String args[]){
        int A[] = {2,4,6,8,10};
        // we want to change an element
        change(A, 2, 20);

        for(int x:A){
            System.out.println(x);
        }

        int x = 10;
        change2(x, 20);
        System.out.println("Value of primitive  " +x); //primitives are passed as values. But when we pass an object as a paramter to a method, the refenrence is passed.
    }
    
}
