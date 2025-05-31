import java.util.*;

import java.time.*;
import java.time.temporal.*;

public class JodaDate {
    public static void main(String args[]){
        Date d = new Date();
        d.setHours(21); //mutable because we can modify the date object
        System.out.println(d); //Combined date and time

        LocalDate ld = LocalDate.parse("2025-01-05");
        LocalDate d1 = ld.plusMonths(6);
        System.out.println(ld);

        LocalTime t = LocalTime.now(); //LocalTime is not mutable
        System.out.println(t);
        LocalTime t1 = t.minusHours(3);
        System.out.println(t);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


        
    }
    
}
