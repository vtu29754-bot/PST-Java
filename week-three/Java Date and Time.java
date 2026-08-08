import java.time.LocalDate;

class PST_Java_Week3_Task1 {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2026;
        System.out.println("Input: Month = " + month + ", Day = " + day + ", Year = " + year);
        System.out.println("Output: " + findDay(month, day, year));
    }
}

/*
INPUT & OUTPUT:

Input: Month = 8, Day = 5, Year = 2026
Output: WEDNESDAY

Explanation:
August 5, 2026 falls on a Wednesday.
*/
