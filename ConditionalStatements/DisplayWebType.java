import java.util.Scanner;

public class DisplayWebType {
    public static void main(String[] args){
        System.out.println("Type in a website. For example: google.com: ");
        Scanner sc = new Scanner(System.in);
        String web = sc.nextLine();
        int index = web.lastIndexOf(".");
        String type = web.substring(index + 1);
        switch(type){
            case "com" : System.out.println("Commercial");
            break;
            case "org" : System.out.println("Organization");
            break;
            default : System.out.println("Invalid");
        }
        sc.close();
    }
    
}
