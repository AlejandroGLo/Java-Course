package Arrays;

public class Challenge3 {
    public static void main(String args[]){
        int A[] = {8,6,10,9,2,15,7,13,14,11};
        int B[] = new int[10];

        /*for(int i=0;i<A.length;i++){
            B[i] = A[i];
            System.out.print(B[i]+",");
        }*/
        
        /*for(int i=A.length-1, j=0;i<0;i--, j++){
            B[j] = A[i];
            System.out.print(B[j]+",");
        }*/

        int C[] = {8,6,10,9,2};
        int D[] = new int[10];

        for(int i=0;i<C.length;i++){
            D[i] = C[i];
        }
        A=B;

        System.out.println(A.length);
    }
    
}
