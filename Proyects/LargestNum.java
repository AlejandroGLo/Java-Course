package Proyects;

public class LargestNum {
    public static void main(String args[]){
        int A[] = {10, 90, 20, 30, 80, 33, 55, 77, 91, 21};
        int max = A[0];
        int min = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
            else if(A[i] < min){
                min = A[i];
            }
        }
        int sum = 0;
        for(int i=0; i<A.length; i++){
            sum = sum + A[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum/A.length);
        
    }
    
}
