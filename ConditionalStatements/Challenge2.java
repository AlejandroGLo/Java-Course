import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int userInput = scanner.nextInt();
        if(userInput <= 14){
            System.out.println("Young");
        }
        else{
            System.out.println("Old");
        }
        scanner.close();
    }
    
    
}
