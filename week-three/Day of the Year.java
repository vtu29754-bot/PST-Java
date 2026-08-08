import java.time.LocalDate;

class PST_Java_Week3_Task3 {
    public static int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);
        return d.getDayOfYear();
    }

    public static void main(String[] args) {
        String date1 = "2019-01-09";
        System.out.println("Input 1: date = " + date1);
        System.out.println("Output 1: " + dayOfYear(date1));

        String date2 = "2019-02-10";
        System.out.println("Input 2: date = " + date2);
        System.out.println("Output 2: " + dayOfYear(date2));
    }
}

/*
INPUT & OUTPUT:

Input 1: date = 2019-01-09
Output 1: 9

Input 2: date = 2019-02-10
Output 2: 41
*/
