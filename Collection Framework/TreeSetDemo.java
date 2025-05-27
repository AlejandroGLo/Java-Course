import java.util.*;
public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<Integer> ts= new TreeSet<>(List.of(10,30,50,70,10,40)); //Sorted tree
        //Collection<Integer> ts1 = new TreeSet<>(List.of(10,30,50,70,10,40)); Can also use collection but not all methods such as ceiling and floor will be available

        ts.add(25); //Gets sorted

        System.out.println(ts.ceiling(55)); //Next number 
        System.out.println(ts.floor(55)); //Previous number

        System.out.println(ts);
    }
    
}
