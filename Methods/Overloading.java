package Methods;

public class Overloading {
    static int max(int x, int y){
        return x>y?x:y; //method for finding the greatest of 2 integers
    }

    static float max(float x, float y){
        return x>y?x:y;
    }
    public static void main(String[] args){
        System.out.println(max(10,5));

    }
    
}
