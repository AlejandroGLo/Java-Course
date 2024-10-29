package Introduction;
import java.util.Scanner;
class Test {
    public static void main(String args[])
    {
        String name;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("May I know your name?");
            name = sc.nextLine();

            System.out.println("Welcome "+name);
        } finally {
            sc.close();
        }
    }
    
}
