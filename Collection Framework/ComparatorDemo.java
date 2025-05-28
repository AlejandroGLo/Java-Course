import java.util.*;

public class ComparatorDemo {
    public static void main(String args[]){
        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5};

        System.out.println(Arrays.compare(a, b)); //First array has one more element than second so one 1 bigger. Output = 1
        //System.out.println(Arrays.compare(a, b)); Second array has one more element than second so one 1 bigger. Output = -1
        //Same thing happens with the values, if they are different, then it will compare all of them to see which one is bigger
        int c[] = Arrays.copyOf(a, a.length);

        //Arrays.fill(c,10); fills array with all values as 10

        Arrays.sort(c);

        for(int x:c){
            System.out.println(x);
        }

       
    }
    
}
