package Methods;

public class Challenge6 {

    /*static int max(int ...A){
        int m=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>m){
                m=A[i];
            }
        }
        return m;
        
    }*/

    /*public static void main(String args[]){
        System.out.println(max(1,3,5,7,4,2,9,2,4));
    }*/

    /*static int sum(int ...A){
        int m=0;
        for(int i=0; i<A.length;i++){
            m=m+A[i];
        }
        return m;
    }*/

    /*public static void main(String args[]){
        System.out.println(sum(1,3,5,7,4,2,9,2,4));
    }*/

    static double discount(double ...P){
        double sum=0;
        for(int i=0; i<P.length;i++){
            sum=sum+P[i];
        }
        if(sum<500){
            return sum*0.10;
        }
        else if(sum>=500 && sum<1000){
            return sum*0.15;
        }
        else{
            return sum*0.20;
        }
    }

    public static void main(String args[]){
        System.out.println(discount(1,3,5,7,4,2,9,2,4));
    }
    
}
