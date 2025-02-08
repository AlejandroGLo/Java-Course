package Proyects;
import java.util.Scanner;

public class PasswordStrength {
    public static void main(String args[]){
        System.out.println("Enter a password: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        if(input.matches(regex)){
            System.out.println("Valid Password!");
        }
        else{
            System.out.println("Invalid Password! Must include: ");
            if (input.length()< 8){
                System.out.println("- At least 8 characters");
            }
            if (!input.matches(".*[A-Z].*")){
                System.out.println("- At least one uppercase letter");
            }
            if (!input.matches(".*[a-z].*")){
                System.out.println("- At least one lowercase letter");
            }
            if (!input.matches(".\\d.*")){
                System.out.println("- At least one digit");
            }
            if (input.matches(".*[@#$%^&+=!]")){
                System.out.println("- At least one special character");
            }
        }

        sc.close();


        
    }
    
}
