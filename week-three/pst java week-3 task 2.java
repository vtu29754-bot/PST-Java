import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PST_Java_Week3_Task2 {
    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        System.out.println("Input 1: date1 = " + date1 + ", date2 = " + date2);
        System.out.println("Output 1: " + daysBetweenDates(date1, date2));

        String date3 = "2020-01-15";
        String date4 = "2019-12-31";
        System.out.println("Input 2: date1 = " + date3 + ", date2 = " + date4);
        System.out.println("Output 2: " + daysBetweenDates(date3, date4));
    }
}

/*
INPUT & OUTPUT:

Input 1: date1 = 2019-06-29, date2 = 2019-06-30
Output 1: 1

Input 2: date1 = 2020-01-15, date2 = 2019-12-31
Output 2: 15
*/
