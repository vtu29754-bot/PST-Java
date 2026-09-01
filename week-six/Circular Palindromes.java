import java.util.ArrayList;
import java.util.List;

public class CircularPalindromes {
    public static List<Integer> circularPalindromes(String s) {
        int n = s.length();
        List<Integer> result = new ArrayList<>();
        String doubled = s + s;

        for (int k = 0; k < n; k++) {
            String rotated = doubled.substring(k, k + n);
            result.add(longestPalindromeLength(rotated));
        }

        return result;
    }

    private static int longestPalindromeLength(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            maxLength = Math.max(maxLength, Math.max(len1, len2));
        }
        return maxLength;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println("Input: " + s);
        System.out.println("Output: " + circularPalindromes(s));
    }
}

/*
INPUT & OUTPUT:

Input: aaaa
Output: [4, 4, 4, 4]
*/
