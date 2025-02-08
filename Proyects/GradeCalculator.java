package Proyects;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]){
        System.out.println("Please enter your grade for Math: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade>=90 && grade<=100){
            System.out.println("Your grade: A");
        }
        else if(grade>=80 && grade<=89){
            System.out.println("Your grade: B");
        }
        else if(grade>=70 && grade<=79){
            System.out.println("Your grade: C");
        }
        else if(grade>=50 && grade<=69){
            System.out.println("Your grade: D");
        }
        else if(grade<50 && grade>=0){
            System.out.println("Your grade: F");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

    }
    
}
