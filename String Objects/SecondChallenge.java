
public class SecondChallenge {
    public static void main(String[] args){
        int b=10110001;
        String str = b+"";
        String str1 = "234AB";
        System.out.println(str.matches("[01]+"));
        System.out.println(str1.matches("[0-9A-F]+"));

    }
    
}
