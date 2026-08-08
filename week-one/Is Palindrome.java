import java.util.function.IntPredicate;

public class Task9_IsPalindrome {

    public static boolean checkPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int num1 = 12321;
        int num2 = 12345;

        IntPredicate palindromeChecker = Task9_IsPalindrome::checkPalindrome;

        System.out.println("Is " + num1 + " a Palindrome? " + palindromeChecker.test(num1));
        System.out.println("Is " + num2 + " a Palindrome? " + palindromeChecker.test(num2));
    }
}

/*
OUTPUT:
Is 12321 a Palindrome? true
Is 12345 a Palindrome? false
*/