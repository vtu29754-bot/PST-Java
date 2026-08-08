import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Input: System Clock");
        System.out.println("Output: Current Date and Time = " + currentDateTime.format(formatter));
    }
}

/*
INPUT & OUTPUT:

Input: System Clock
Output: Current Date and Time = 2026-08-08 09:20:00
*/
