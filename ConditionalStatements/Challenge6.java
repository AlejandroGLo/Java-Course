import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args){
        System.out.println("Enter a website URL: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String protocol = userInput.substring(0, userInput.indexOf(":"));
        if(protocol.equals("https")){
            System.out.println("Hypertext Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String ext=userInput.substring(userInput.lastIndexOf(".")+1);
        if(ext.equals("com")){
            System.out.println("Commercial");
        }
        else {
            System.out.println("Other");
        }
        sc.close();
        
    }
}
