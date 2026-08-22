public class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0;
        int n = s.length();

        // 1. Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i >= n) return 0;

        // 2. Check sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Read digits and build number with overflow checks
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        String s1 = "42";
        System.out.println("Input 1: \"" + s1 + "\"");
        System.out.println("Output 1: " + myAtoi(s1));

        String s2 = " -042";
        System.out.println("Input 2: \"" + s2 + "\"");
        System.out.println("Output 2: " + myAtoi(s2));

        String s3 = "1337c0d3";
        System.out.println("Input 3: \"" + s3 + "\"");
        System.out.println("Output 3: " + myAtoi(s3));

        String s4 = "0-1";
        System.out.println("Input 4: \"" + s4 + "\"");
        System.out.println("Output 4: " + myAtoi(s4));

        String s5 = "words and 987";
        System.out.println("Input 5: \"" + s5 + "\"");
        System.out.println("Output 5: " + myAtoi(s5));
    }
}

/*
INPUT & OUTPUT:

Input 1: "42"
Output 1: 42

Input 2: " -042"
Output 2: -42

Input 3: "1337c0d3"
Output 3: 1337

Input 4: "0-1"
Output 4: 0

Input 5: "words and 987"
Output 5: 0
*/
