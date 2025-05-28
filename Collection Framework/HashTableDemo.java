import java.util.*;

public class HashTableDemo {
    public static void main(String args[]){
        Hashtable ht = new Hashtable(); // We can also use with generic <Integer, String> for example

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        // String s = ht.get(3); returns object which cant be assigned to a string so it cant retrieve the value
        String s = (String)ht.get(3); //Using typecast we can

        Enumeration e= ht.elements();
        Enumeration en = ht.keys();
        e.nextElement();
        en.nextElement();

        ht.compute(2, (k,v) -> v+"Z");

        ht.computeIfAbsent(7, (k)->"Z"+k);

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println(ht);
    }
    
}
