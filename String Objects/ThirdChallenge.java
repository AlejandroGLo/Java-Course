
public class ThirdChallenge {
    public static void main(String[] args){
        String str="a!B@C#1$2%3";
        String str1="abc    de   fgh    ";
        String str2="abc de fgh ijk";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(str1.replaceAll("\\s", "").trim());
        String words[]=str2.split("\\s");
        System.out.println(words.length);
    }
    
}
