package Arrays;

public class Challenge4 {
    public static void main(String args[]){
        int A[][] = {{3,5,9}, {7,6,2}, {4,3,5}};
        int B[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
        int C[][]=new int[3][3];

        /*for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length;j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }*/

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length;j++){
                C[i][j] =0;
                for(int k=0; k<A.length;k++){
                    C[i][j] =C[i][j] + A[i][k]*B[k][j];
                }
            }
        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y+ " ");
            }
            System.out.println("");
        }

    }
    
}
