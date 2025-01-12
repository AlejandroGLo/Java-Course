import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        System.out.println("What day of the week is it: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput==1){
            System.out.println("Monday");
        }
        else if(userInput==2){
            System.out.println("Tuesday");
        }
        else if(userInput==3){
            System.out.println("Wednesday");
        }
        else if(userInput==4){
            System.out.println("Thursday");
        }
        else if(userInput==5){
            System.out.println("Friday");
        }
        else if(userInput==6){
            System.out.println("Saturday");
        }
        else if(userInput==7){
            System.out.println("Sunday");
        }

        sc.close();
    }
    
}
