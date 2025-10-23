package Day51Package;

import java.util.Calendar;
import java.util.TimeZone;

public class GregorianCalendar {
    public static void main(String[] args){
        Calendar cl=Calendar.getInstance();
        System.out.println(cl.getTime());
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.SECOND));
        System.out.println(cl.get(Calendar.HOUR));
        java.util.GregorianCalendar gc=new java.util.GregorianCalendar();
        System.out.println(gc.isLeapYear(1900));
        System.out.println(gc.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(gc.isLeapYear(1900));


    }
}
