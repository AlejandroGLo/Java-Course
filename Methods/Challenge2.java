package Methods;

public class Challenge2 {
    //int m=25, n=15
    static int greatestCommonDen(int m, int n){
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        return m;

    }
    public static void main(String args[]){
        System.out.println(greatestCommonDen(25,15));
    }
    
}
