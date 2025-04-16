package JavaLangPackage;

public class WrapperDemo2 {
    public static void main(String agrs[]){
        int m1=15;//primitive

        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("1010", 2);
        Integer m4 = Integer.decode("0xA7");

        //System.out.println(m2.equals(m1)); //can compare object to primitive
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(Integer.parseInt("123"));

    }
    
}
