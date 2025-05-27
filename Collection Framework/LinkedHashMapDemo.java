import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String args[]){
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5; //makes least recently used (added) removed. Since we gave 1 and 2 use after adding them, 3 is the least recently used
                // if we remove the constructor .75f and true, it will remove the first added element. (insertion order or recently used order)
            }
        }; //this constructor determines the order in which they are shown. here its last access goes first
        

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        String s = lhm.get(2);
        s = lhm.get(5);
        s=lhm.get(1);
        lhm.put(6, "F");
        // lhm.put(9, "I");
        // lhm.put(8, "H");

        lhm.forEach((k,v)->System.out.println(k+ " "+v));

        
    }
    
}
