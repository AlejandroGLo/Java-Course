package Arrays;

public class Challenge1 {
    public static void main(String args[]){
        int sum = 0;
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        /*for(int i=0; i<A.length;i++){
            sum = sum + A[i];
        }
        System.out.println("Final sum = " + sum);*/
        
        /*for(int i=0; i<A.length;i++){
            if(A[i] == 6){
                System.out.println("6 is in position " + i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");*/
        
        /*int max = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.println(max);*/
        int max1=A[0];
        int max2=A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] > max1){
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i] > max2){
                max2 = A[i];
            }
        }
        System.out.println(max2);
    }
    
}
