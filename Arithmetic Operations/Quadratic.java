import java.util.Scanner;
public class Quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of the first coefficient: ");
        int a = sc.nextInt();
        System.out.println("The value of the second coefficient: ");
        int b = sc.nextInt();
        System.out.println("The value of the third coefficient: ");
        int c = sc.nextInt();

        int root1 = (int) ((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
        int root2 = (int) ((-b - Math.sqrt(b*b - 4*a*c))/(2*a));

        System.out.println("The roots of the quadratic equation are: " + root1 + " and " + root2);
    }
    
}
