
import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first grade: ");
        float userInput1 = scanner.nextFloat();
        System.out.println("Give me the second grade: ");
        float userInput2 = scanner.nextFloat();
        System.out.println("Give me the third grade: ");
        float userInput3 = scanner.nextFloat();

        float total = userInput1 + userInput2 + userInput3;
        float avg = total/3;

        System.out.println("The average grade is: " + avg);
        if(avg < 50){
            System.out.println("F");
        }
        else if(avg>=50 && avg<70){
            System.out.println("D");
        }
        else if(avg>=70 && avg<90){
            System.out.println("C");
        }
        else if(avg>=90 && avg<100){
            System.out.println("B");
        }
        else if(avg==100){
            System.out.println("A");
        }

        scanner.close();

    }
    
}
