package Day50Package;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args){
        Date d=new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println("Years since 1900");
        System.out.println(d.getYear());
        System.out.println(d.getSeconds());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getMinutes());

    }
}
