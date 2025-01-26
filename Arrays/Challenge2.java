package Arrays;

public class Challenge2 {
    public static void main(String [] args){
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        int n = 6;
        for(int i=0; i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        int x = 15;
        int index = 2;
        for(int i=n;i>index;i--){
            A[i] = A[i-1];
        }
        A[index] = x;

        for(int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        //To remove an element: We remove the element and shift the rest of the elements on the right of the deleted element to the left.

        //int B[] = {1,2,3,4,5,6,7,8};
        /*int temp = B[0];
        for(int i=1; i<B.length; i++){
            B[i-1] = (B[i]);
        }
        B[B.length-1]=temp;

        for(int x:B){
            System.out.print(x+",");
        }
        System.out.println("");*/


    }
    
}
