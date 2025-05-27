import java.util.*;
import java.util.TreeMap;
import java.util.Map.*;

public class HashMapDemo {
        public static void main(String args[]){
        HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A", 1, "B", 2,"C", 3, "D"));

        System.out.println(tm); //Prints key and value pait
        tm.put(4,"E");
        tm.put(5,"F");

        // Entry<Integer, String> e = tm.firstEntry(); Entry method not in hashmaps
        // System.out.println(e.getKey()+ " "+e.getValue());
        
    }
    
}
