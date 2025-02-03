package Methods;

public class Recursive {

    static void fun(int n){
        if(n>0){
            //fun(n-1);
            //System.out.println(n);
            
            System.out.println(n);
            fun(n-1);
        }
    }

    public static void main(String args[]){
        fun(3);
    }

    
}
