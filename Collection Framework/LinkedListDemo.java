import java.util.*;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<Integer> al1 = new LinkedList<>();

        LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0, 5); //5 is inserted before 10
        al1.addAll(1, al2);
        al1.add(5,70);

        al1.addFirst(3); //With LinkedList this option is available
        al1.addLast(3); //With LinkedList this option is available

        System.out.println(al1.contains(50));
        System.out.println(al1.contains(25));

        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));

        al1.set(6,100);

        System.out.println(al1);
    }
}
