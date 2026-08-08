import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2004, 5, 15);
        LocalDate currentDate = LocalDate.of(2026, 8, 8);

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Input: Birth Date = " + birthDate);
        System.out.println("Current Date = " + currentDate);
        System.out.println("Output: Age = " + age.getYears() + " Years, " + age.getMonths() + " Months, " + age.getDays() + " Days");
    }
}

/*
INPUT & OUTPUT:

Input: Birth Date = 2004-05-15, Current Date = 2026-08-08
Output: Age = 22 Years, 2 Months, 24 Days
*/
