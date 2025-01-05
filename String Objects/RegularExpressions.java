
public class RegularExpressions {

    public static void main(String [] args){
        String str1 = "a";

        System.out.println(str1.matches(".")); //there is a single character

        String str2 = "ab";

        System.out.println(str2.matches(".")); //false
        System.out.println(str1.matches("[abc]")); //true because str1 = "a"
        System.out.println(str2.matches("[abc]")); //false because it is for only one character
        System.out.println(str1.matches("[^abc]")); //not
        System.out.println(str1.matches("[a-z]"));
        System.out.println(str1.matches("[0-9]"));
        System.out.println(str1.matches("a|b")); //a or b

        String str3 = "a";
        System.out.println(str3.matches("\\w")); //we use \ twice because it doesnt detect it as regular expression
        System.out.println(str3.matches("\\d")); //digits
        System.out.println(str3.matches("\\s")); //space

        String str4 = "abcdef";
        String str5 = "abc6def";
        String str6 = "abf";

        System.out.println(str4.matches(".*"));
        System.out.println(str4.matches("[a-z]*"));
        System.out.println(str5.matches("[a-z]*"));
        System.out.println(str6.matches("[abf]{3}"));

        String str7 = "john@gmail.com";
        System.out.println(str7.matches("\\w*@gmail(.*)"));

    }
    
}
