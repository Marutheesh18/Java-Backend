
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;



public class DateTimeAPI {
    public static void main(String[] args) {


        // Date

        LocalDate ld= LocalDate.now();
        System.out.println("Current Date Is "+ld);

        LocalDate yesterday= ld.minusDays(1);
        LocalDate tomorrow= ld.plusDays(1);

        System.out.println("Yesterday Date Is "+ yesterday);
        System.out.println("Tomorrow Date Is "+ tomorrow);


        int year = 2021;
        int month = 2;
        int dayOfMonth =27;
        LocalDate date1= LocalDate.of(year, month, dayOfMonth);
        System.out.println("Date 1 : " + date1);

        LocalDate date2= LocalDate.of(2016, 4, 18);
        System.out.println(date2.isLeapYear());


        //Time

        LocalTime lt= LocalTime.now();
        System.out.println("Current Time Is "+lt);

        LocalTime time1= LocalTime.of(12,30,55);
        System.out.println(time1);

        LocalTime time2=time1.minusHours(2);
        LocalTime time3=time2.plusMinutes(15);

        System.out.println(time3);

        int hour = 4;
        int minute=45;
        int second=55;
        LocalTime time4= LocalTime.of(hour,minute,second);

        System.out.println(time4);
        System.out.println(time4.getMinute());
        System.out.println(time4.getHour());


        //TimeZones

        ZoneId z1= ZoneId.of("Asia/Kolkata");
        ZoneId z2= ZoneId.of("Asia/Tokyo");

        LocalTime zt1= LocalTime.now(z1);
        LocalTime zt2= LocalTime.now(z2);

        System.out.println("Time In India is "+zt1);
        System.out.println("Time In Japan is "+zt2);


        // Date and Time

        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime dt2= LocalDateTime.of(2022,Month.JULY,10,12,30);
        System.out.println(dt2);

        LocalDateTime dt3 = dt2.minusDays(5).minusHours(2).plusMinutes(20);
        System.out.println(dt3);
    }
}
