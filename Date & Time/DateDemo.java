import java.util.*;

public class DateDemo {
    public static void main(String args[]){

        Date d = new Date(); //this objects contains date and time
        Date d1 = new Date("'1/1/1980");
        Date d2 = new Date("7/26/2020");

        System.out.println(d);
        System.out.println(d1);
        System.out.println(d.getDay());
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); //to get years we divide by 1000 (to get seconds), 60 and 60 (to get min & hr)...
        System.out.println(Long.MAX_VALUE);
    }
    
}
