import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What will the base of the triangle be: ");
        float base = sc.nextFloat();
        System.out.println("What will the height of the triangle be: ");
        float height = sc.nextFloat();
        float area = (base*height)/2;
        System.out.println("The area of the triangle is: " + area);
        
    }
    
}
