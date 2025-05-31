import java.util.*;

public class DateCalendar {
    public static void main(String[] args){
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

    }
    
}
