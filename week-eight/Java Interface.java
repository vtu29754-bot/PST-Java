public class JavaInterface {
    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int n = 6;
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println("Input: " + n);
        System.out.println("Output: " + myCalculator.divisor_sum(n));
    }
}

/*
INPUT & OUTPUT:

I implemented: AdvancedArithmetic
Input: 6
Output: 12
*/
