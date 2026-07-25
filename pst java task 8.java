import java.util.function.IntUnaryOperator;

public class Task8_NthFibonacci {
    public static void main(String[] args) {
        int n = 8;

        IntUnaryOperator fibonacci = num -> {
            if (num <= 0) return 0;
            if (num == 1) return 1;
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        };

        System.out.println("Finding " + n + "th Fibonacci number...");
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci.applyAsInt(n));
    }
}

/*
OUTPUT:
Finding 8th Fibonacci number...
The 8th Fibonacci number is: 21
*/