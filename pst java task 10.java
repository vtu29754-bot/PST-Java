import java.util.function.IntBinaryOperator;

public class Task10_SumOfLastDigits {

    public static int addLastDigits(int num1, int num2) {
        int lastDigit1 = Math.abs(num1) % 10;
        int lastDigit2 = Math.abs(num2) % 10;
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        int a = 267;
        int b = 154;

        IntBinaryOperator sumLastDigits = Task10_SumOfLastDigits::addLastDigits;

        int result = sumLastDigits.applyAsInt(a, b);

        System.out.println("First Number: " + a + " (Last Digit: " + (a % 10) + ")");
        System.out.println("Second Number: " + b + " (Last Digit: " + (b % 10) + ")");
        System.out.println("Sum of last digits: " + result);
    }
}

/*
OUTPUT:
First Number: 267 (Last Digit: 7)
Second Number: 154 (Last Digit: 4)
Sum of last digits: 11
*/