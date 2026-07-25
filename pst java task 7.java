import java.util.function.BiFunction;

public class Task7_DigitSumOpt {
    public static void main(String[] args) {
        int number = 123456789;

        BiFunction<Integer, String, Integer> digitSumOpt = (num, opt) -> {
            int sum = 0;
            num = Math.abs(num);
            while (num > 0) {
                int digit = num % 10;
                if ("even".equalsIgnoreCase(opt) && digit % 2 == 0) {
                    sum += digit;
                } else if ("odd".equalsIgnoreCase(opt) && digit % 2 != 0) {
                    sum += digit;
                }
                num /= 10;
            }
            return sum;
        };

        System.out.println("Number: " + number);
        System.out.println("Sum of EVEN digits: " + digitSumOpt.apply(number, "even"));
        System.out.println("Sum of ODD digits: " + digitSumOpt.apply(number, "odd"));
    }
}

/*
OUTPUT:
Number: 123456789
Sum of EVEN digits: 20
Sum of ODD digits: 25
*/