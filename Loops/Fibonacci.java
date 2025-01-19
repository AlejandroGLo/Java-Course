package Loops;

public class Fibonacci {
    public static void main(String args[]){
        /*int a = 3;
        int d = 7;
        int n = 10;
        int term = a;*/
        /*for(int i=0; i<n; i++){
            System.out.print(term+",");
            term = term+d;
        }*/

        /*for(int i=0; i<n; i++){
            System.out.print(term +",");
            term = term*d;
        }*/
        
        int a = 0;
        int b = 1;
        int c;
        int n = 10; 
        System.out.print(a + "," + b + ",");
        for(int i=0; i<n-2; i++){
            c= a+b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
    }
    
}
