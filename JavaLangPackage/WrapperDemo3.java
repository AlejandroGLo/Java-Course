package JavaLangPackage;

public class WrapperDemo3 {
    public static void main(String args[]){
        float a=12.5f;
        Float b = 12.5f/0;
        //System.out.println(b.equals(a));

        System.out.println(b.isInfinite());

        Float c=(float)Math.sqrt(-1);

        System.out.println(c.isNaN());

        Character x = 'A';
        //Character.toUpperCase(0);
        Boolean y;
        //Boolean.compare() 

    }
    
}
