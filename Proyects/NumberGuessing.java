package Proyects;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String args[]){
        System.out.println("Guess a number from 1-100: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        int guess=0;
        while(guess!=randomNum){
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();

            if(guess<=0 && guess>100){
                System.out.println("Invalid number");
            }
            else if(guess<randomNum){
                System.out.println("Too Low! Try Again! ");
            }
            else if(guess>randomNum){
                System.out.println("Too High! Try Again! ");
            }
            else {
                System.out.println("Congratulations! You guessed it!");
            }

        }
        sc.close();
    }
    
}
