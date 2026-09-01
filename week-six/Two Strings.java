import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "hello", s2 = "world";
        System.out.println("Input 1: s1 = " + s1 + ", s2 = " + s2);
        System.out.println("Output 1: " + twoStrings(s1, s2));

        String s3 = "hi", s4 = "world";
        System.out.println("Input 2: s1 = " + s3 + ", s2 = " + s4);
        System.out.println("Output 2: " + twoStrings(s3, s4));
    }
}

/*
INPUT & OUTPUT:

Input 1: s1 = hello, s2 = world
Output 1: YES

Input 2: s1 = hi, s2 = world
Output 2: NO
*/
