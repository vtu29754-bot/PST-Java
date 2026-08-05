import java.time.LocalDate;

public class Task11_JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) {
        int month1 = 8, day1 = 14, year1 = 2017;
        System.out.println("Input 1: Month = " + month1 + ", Day = " + day1 + ", Year = " + year1);
        System.out.println("Output 1: " + findDay(month1, day1, year1));

        int month2 = 8, day2 = 5, year2 = 2026;
        System.out.println("Input 2: Month = " + month2 + ", Day = " + day2 + ", Year = " + year2);
        System.out.println("Output 2: " + findDay(month2, day2, year2));
    }
}
