import java.util.*;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String args[]){
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10); //10=initial size
        HashSet<String> hs = new HashSet<>(10); //This would print the values below in a sorted order

        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");

        lhs.add("B"); //Wont insert B again because it is SET

        //lhs.forEach(System.out::println);
    }
    
}
