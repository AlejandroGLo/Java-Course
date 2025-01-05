
public class FirstChallenge {
    public static void main(String[] args){
        String str = "programmer@gmail.com";
        System.out.println(str.matches("\\w*@gmail(.*)"));

        int i=str.indexOf("@");
        String username=str.substring(0,i);
        String domain = str.substring(i+1, str.length());
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));

        //System.out.println(domain.startsWith("gmail"));
    }
    
}
