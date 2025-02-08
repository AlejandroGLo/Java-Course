package Proyects;
import java.util.Scanner;

public class SecretCode {
    public static void main(String args[]){
        System.out.println("Enter a Sentence: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String upper = input.toUpperCase();
        String replace = upper.replaceAll("[aeiouAEIOU]", "*");
        String reverse = new StringBuilder(replace).reverse().toString();
        System.out.println(reverse);

        sc.close();
    }
    
    
    
    
}
