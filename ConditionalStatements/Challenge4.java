
import java.util.Scanner;
public class Challenge4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which year would you like to check: ");
        int userInput = sc.nextInt();
        if(userInput % 4 == 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
    
}
