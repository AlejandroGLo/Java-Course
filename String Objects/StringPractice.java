//Ways to create a String

public class StringPractice{
    public static void main(String[] args){
        String str1 = "Java Program"; // Created in the pool memory

        String str2 = new String("JAVA"); // Created in the Heap memory

        char c[]={'H', 'e', 'l', 'l', 'o'};

        String str3=new String(c); //Hello

        String str4 = new String(c, 1, 3); //ell

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
