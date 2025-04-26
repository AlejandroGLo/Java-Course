package JavaLangPackage;
//Basically for viewing the information of the class
import java.lang.reflect.*;

class My{
    private int a;
    protected int b;
    public int c;
    int d;

    public My(){} //non param constructor

    public My(int x, int y){} //param constructor

    public void display(String s1, String s2){}

    public int show(int x, int y) {
        return 0;
    }



}

public class ReflectDemo {
    public static void main(String args[]){
        Class c=My.class; //c will get all the details of the My class

        Field field[] = c.getDeclaredFields();

        Constructor con[] = c.getConstructors();

        Method method[] = c.getMethods();

        for(Field f:field){
            System.out.println(f);
        }

        for(Constructor ct:con){
            System.out.println(ct);
        }

        for(Method m:method){
            System.out.println(m);
        }
    }

    
}
