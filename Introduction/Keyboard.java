package Introduction;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner

        try {
            // Your code to use the scanner here
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } finally {
            sc.close(); // Close the scanner
        }
    }
}

