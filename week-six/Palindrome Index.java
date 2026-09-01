public class PalindromeIndex {
    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }
                return -1;
            }
            left++;
            right--;
        }
        return -1;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aaab";
        System.out.println("Input 1: " + s1);
        System.out.println("Output 1: " + palindromeIndex(s1));

        String s2 = "baa";
        System.out.println("Input 2: " + s2);
        System.out.println("Output 2: " + palindromeIndex(s2));

        String s3 = "aaa";
        System.out.println("Input 3: " + s3);
        System.out.println("Output 3: " + palindromeIndex(s3));
    }
}

/*
INPUT & OUTPUT:

Input 1: aaab
Output 1: 3

Input 2: baa
Output 2: 0

Input 3: aaa
Output 3: -1
*/
