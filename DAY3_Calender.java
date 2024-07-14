
// Here I have not solved any question just exploreed the calender class

//  c.get(Calender.YEAR); - to get the year of the current Instance
// c.set(Calender.YEAR,2025) - setting the year to 2025 
//.get() - for getting the values and .set() to set the values 
import java.util.Calendar;

public class DAY3_Calender {
    public static void main(String[] args) {
        // Create a calendar instance
        Calendar c = Calendar.getInstance(); // initialize with current Date and time 

        // Get the current year, month , day of month, hour of day ,minute,second 
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH); 
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        // Printing
        System.out.println("Current Date and Time:");
        System.out.println(year + "-" + (month + 1) + "-" + day + " " + hour + ":" + minute + ":" + second);

        // Modifying
        c.set(Calendar.YEAR, 2025);
        c.set(Calendar.MONTH, Calendar.JULY); 
        c.set(Calendar.DAY_OF_MONTH, 13);

        // Printing the modified date
        System.out.println("Modified Date:");
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));
    }
}


