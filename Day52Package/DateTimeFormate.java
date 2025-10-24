package Day52Package;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormate {
    public static void main(String[] args){
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyy --E");
        String onlyDate=dt.format(df);
        System.out.println(onlyDate);

        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String onlyDate2=dt.format(df2);
        System.out.println(onlyDate2);

        DateTimeFormatter df3=DateTimeFormatter.ISO_DATE_TIME;
        String onlyDate3=dt.format(df3);
        System.out.println(onlyDate3);
    }
}
