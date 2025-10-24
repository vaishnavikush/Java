package Day52Package;

import java.time.*;

public class DateAndTime {
    public static void main(String[] args){
        System.out.println("Today's Date");
        LocalDate d=LocalDate.now();
        System.out.println(d);

        System.out.println("Today's Time");
        LocalTime t= LocalTime.now();
        System.out.println(t);

        System.out.println("Today's Date & Time");
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
