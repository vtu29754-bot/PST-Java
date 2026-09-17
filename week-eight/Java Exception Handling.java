public class JavaExceptionHandling {
    static class MyCalculator {
        public long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            }
            if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int[][] testCases = {
            {3, 5},
            {2, 4},
            {0, 0},
            {-1, -2},
            {-1, 3}
        };

        for (int[] test : testCases) {
            int n = test[0];
            int p = test[1];
            try {
                System.out.println("power(" + n + ", " + p + ") = " + myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println("power(" + n + ", " + p + ") -> " + e.getMessage());
            }
        }
    }
}

/*
INPUT & OUTPUT:

power(3, 5) = 243
power(2, 4) = 16
power(0, 0) -> n and p should not be zero.
power(-1, -2) -> n or p should not be negative.
power(-1, 3) -> n or p should not be negative.
*/
