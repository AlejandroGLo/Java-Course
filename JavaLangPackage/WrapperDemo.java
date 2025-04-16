package JavaLangPackage;

public class WrapperDemo {
    public static void main(String args[]){
        //Integer i=new Integer(10); Deprecated

        //Objects:
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte bb=15;
        Byte x = Byte.valueOf(bb);//Wrapping

        Byte c = Byte.valueOf("15");
        Byte d = 15;
        

        Short e = Short.valueOf("123");

        Float f = 12.3f; // Remember to specify its a float by adding f
        Float g = Float.valueOf("123.5");
        float y = g.floatValue();
        float z = g; //unboxing (opposite of wrapping)

        Double h=Double.valueOf(123.456);

        Character j = Character.valueOf('A'); //Give in single quotes

        Boolean k = Boolean.valueOf("true");
    }
    
}
