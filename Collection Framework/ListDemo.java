import java.util.*;

public class ListDemo {
    public static void main(String args[]){
        ArrayList<Integer> al1 = new ArrayList<>(20); //initial capacity is 20, but size adapts automatically

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0, 5); //5 is inserted before 10
        al1.addAll(1, al2);
        al1.add(5,70);

        System.out.println(al1.contains(50));
        System.out.println(al1.contains(25));

        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));

        al1.set(6,100);

        System.out.println(al1);


        // for(int i=0;i<al1.size();i++){
        //     System.out.println(al1.get(i));
        // }

        // for(var x:al1){
        //     System.out.println(x);
        // }

        // for(Iterator<Integer> it = al1.iterator(); it.hasNext();){
        //     java.lang.Integer x = it.next();
        //     System.out.println(x);
        // }

        /*Iterator<Integer> it = al1.Iterator();
        ListIterator<Integer> it1 = al1.listIterator();

        while(it1.hasNext()){
            System.out.println(it1.next());
            System.out.println(it1.previous()); Previous is available when we use ListIterator
        }*/
    

        

    }
    
}
