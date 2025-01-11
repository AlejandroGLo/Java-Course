//Find if a number is odd or even
import java.util.Scanner;

public class Challenge1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        if(userInput % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        scanner.close();
    }
    
}
