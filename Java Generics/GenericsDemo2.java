

public class GenericsDemo2 {

    static <E> void show(E[] list){ //we need to define generics before the return type - E generics for Elements
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String args[]){
        show(new String[]{"Hi", "Go", "Bye"}); //E will become a String type
        show(new Integer[]{10,20,30,40});
        //works for every type of data
    }
    
}
