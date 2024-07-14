/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example

The method should return  as the day on that date. */
//Link - https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true

import java.util.Calendar;

public class DAY3_DayOFTheWeek {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month-1);
        c.set(Calendar.DAY_OF_MONTH,day);
        
        int DayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        
        switch(DayOfWeek){
            case Calendar.SUNDAY:    return "SUNDAY";
            case Calendar.MONDAY:    return "MONDAY";
            case Calendar.TUESDAY:   return "TUESDAY";
            case Calendar.WEDNESDAY: return "WEDNESDAY";
            case Calendar.THURSDAY:  return "THURSDAY";
            case Calendar.FRIDAY:    return "FRIDAY";
            case Calendar.SATURDAY:  return "SATURDAY";
            default:                 return "INVALID DAY";
        }
        
    }
}
