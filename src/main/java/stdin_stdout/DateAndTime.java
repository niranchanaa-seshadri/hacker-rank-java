package stdin_stdout;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * This class receives an input from the console in the form of mm dd yyyy
 * It then prints the day of the week
 */
public class DateAndTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = Integer.parseInt(sc.next());
        int date = Integer.parseInt(sc.next());
        int year = Integer.parseInt(sc.next());

        if(year>1900 && year<3000){
            String day = DateAndTime.findDay(month, date, year);
            System.out.println(day);
        }
    }

    public static String findDay(int m, int d, int y) {
        String day_of_week;

        Calendar cal = Calendar.getInstance();
        //m-1 because month uses 0 count
        cal.set(y, m-1, d);
        day_of_week = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        System.out.println("Day of week from getDisplayName: "+day_of_week.toUpperCase());

        return day_of_week.toUpperCase();
    }
}
