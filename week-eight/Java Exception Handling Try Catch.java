import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void divide(String inputX, String inputY) {
        try {
            Scanner scX = new Scanner(inputX);
            Scanner scY = new Scanner(inputY);

            int x = scX.nextInt();
            int y = scY.nextInt();

            int result = x / y;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1 (10 / 3):");
        divide("10", "3");

        System.out.println("\nTest Case 2 (10 / 0):");
        divide("10", "0");

        System.out.println("\nTest Case 3 (2147483648 / 9):");
        divide("2147483648", "9");
    }
}

/*
INPUT & OUTPUT:

Test Case 1 (10 / 3):
Result: 3

Test Case 2 (10 / 0):
java.lang.ArithmeticException: / by zero

Test Case 3 (2147483648 / 9):
java.util.InputMismatchException
*/
