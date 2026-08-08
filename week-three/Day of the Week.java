import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class PST_Java_Week3_Task4 {
    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        System.out.println("Input: day = " + day + ", month = " + month + ", year = " + year);
        System.out.println("Output: " + dayOfTheWeek(day, month, year));
    }
}

/*
INPUT & OUTPUT:

Input: day = 31, month = 8, year = 2019
Output: Saturday

Explanation:
August 31, 2019 was a Saturday.
*/
