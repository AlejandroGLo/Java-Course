package StaticAndFinal;

public class FinalPractice {
    // 1.2 final float PI; No initialization = error
    // final float PI = 3.1425f; 1.3
    static final float PI = 3.1425f;
    public static void main(String args[]){
        // 1.1 final float PI;
        // 1.1 System.out.println(PI); Cant because final variable PI has not been initialized

        //System.out.println(PI); 1.3 Wont work if we dont make the variable static as well because of the main method
        System.out.println(PI);

    }
    
}
