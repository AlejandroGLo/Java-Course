
public class StringMethods {
    public static void main(String[] args){
        String str = new String("JAVA   ");

        int len = str.length();

        System.out.println(len);

        String str2 = str.toLowerCase();
        System.out.println(str2);

        String str3 = str.trim();
        System.out.println(str3);

        String str4 = str.substring(2, 4);
        System.out.println(str4);

        String str5 = str.replace('A', 'X');
        System.out.println(str5);

        String str6 = "Mr. Shahrukh Khan";
        System.out.println(str6.startsWith("Mr.")); //Case sensitive

        System.out.println(str6.charAt(5));

        System.out.println(str6.indexOf("h"));
        System.out.println(str6.indexOf("h", 6));

        String str7 = "Pyramid";
        String str8 = "Pyramid";

        System.out.println(str7.equals(str8)); // Case sensitive. here it is true
        //System.out.println(str7.equalsIgnoreCase(str8));
        System.out.println(str7==str8); //Compares references of objects

        System.out.println(str7.compareTo(str8)); //Returns 0 before both are the same

        String str9 = "Pyramid";
        String str10 = "hello";

        System.out.println(str9.compareTo(str10));

        System.out.println(str9.concat(str10));

        String str11 = "the great wall of china";
        System.out.println(str11.contains("wall")); //returns true

    }
    
}
