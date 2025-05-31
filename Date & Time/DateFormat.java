import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class DateFormat {
    public static void main(String args[]){
        ZonedDateTime dt = ZonedDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:SS z Z"); //can also use - instead of /

        System.out.println(df.format(dt));

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));
    }
    
}
