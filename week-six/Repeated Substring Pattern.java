public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        String s1 = "abab";
        System.out.println("Input 1: " + s1);
        System.out.println("Output 1: " + repeatedSubstringPattern(s1));

        String s2 = "aba";
        System.out.println("Input 2: " + s2);
        System.out.println("Output 2: " + repeatedSubstringPattern(s2));

        String s3 = "abcabcabcabc";
        System.out.println("Input 3: " + s3);
        System.out.println("Output 3: " + repeatedSubstringPattern(s3));
    }
}

/*
INPUT & OUTPUT:

Input 1: abab
Output 1: true

Input 2: aba
Output 2: false

Input 3: abcabcabcabc
Output 3: true
*/
