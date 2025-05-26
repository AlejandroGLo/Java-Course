import java.util.*;

public class PriorityDemo {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek()); //gives the head of the list. In this case 3, because its the lowest value so it has high priority

        pq.forEach((x) -> System.out.println(x));

    }
    
}
