package StaticAndFinal;

class Test{
    static{
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }

}
public class StaticPractice2 {
    public static void main(String agrs[]){
        Test t = new Test(); //If we dont create the object so we use the class, block1 and 2 wont be printed
        System.out.println("Main");
    }
    
}
