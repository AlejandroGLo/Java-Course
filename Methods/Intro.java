package Methods;



public class Intro {
    static int max(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String args[]){
        int a=10, b=15;

        System.out.println(max(a,b)); //static methods can call only static methods

        /*Intro mp = new Intro();
        System.out.println(mp.max(a,b));*/

    }
    
}
