// import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
// import java.util.GregorianCalendar;
// import java.util.spi.CalendarNameProvider;
// import java.util.Calendar;
// import java.util.TimeZone;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class OtherClasses {
    public static void main(String args[]){
        // System.out.println(Long.MAX_VALUE);
        // long t = System.currentTimeMillis();
        // System.out.println(t);

        //Date Class
        // Date d = new Date();
        // System.out.println(d);
        // System.out.println(d.getTime());

        //Calander Class - abstract class
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.MINUTE));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));

        //Gregorian Calander
        // GregorianCalendar cal = new GregorianCalendar();
        // System.out.println(cal.isLeapYear(2023));           
        // System.out.println(TimeZone.getAvailableIDs()[0]);      //gets the time zone of that index
        // System.out.println(TimeZone.getAvailableIDs()[1]);

        //java.time API
        LocalDate d = LocalDate.now();
        // System.out.println(d);

        LocalTime t = LocalTime.now();         //via this we can also get nano seconds too
        // System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();       //same with this we can also access nano secods
        // System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy --E H:m a");    //this is only the date obj. formetor and not the actual date 
        DateTimeFormatter df2 = DateTimeFormatter.ISO_DATE_TIME;    //this is only the date obj. formetor and not the actual date 
        String mydate = dt.format(df);
        String mydate2 = dt.format(df2);
        System.out.println(mydate);
        // System.out.println(mydate2);

        HashSet<Integer> s = new HashSet();
        s.add(10);
        s.add(1);
        s.add(37);
        s.add(100);
        s.add(100);

        for (Integer ele : s) {
            System.out.println(ele);
        }
    }
}
