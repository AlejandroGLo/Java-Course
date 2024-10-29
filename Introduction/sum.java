package Introduction;
import java.util.Scanner;
public class sum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        try {
            int x,y;
            System.out.println("Enter 2 Numbers:");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("Sum of 2 Numbers is: "+(x+y));
        } finally {
            sc.close();
        }
    }
    
}
