package Day53Package;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateFormatePractice {
    public static void main(String[] args){
        LocalDateTime d=LocalDateTime.now();
        System.out.println(d);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd:MM:yyy");
        String dm=d.format(df);
        System.out.println(dm);
    }
}
