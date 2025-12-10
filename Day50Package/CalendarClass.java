package Day50Package;

import java.util.*;

public class CalendarClass {
    public static void main(String[] args){
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
//        System.out.println(c.get);
        System.out.println(c.getTimeZone().getID());
}
}

