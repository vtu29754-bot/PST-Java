import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, sFreq)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
            sFreq[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "cbaebabacd", p1 = "abc";
        System.out.println("Input 1: s = \"" + s1 + "\", p = \"" + p1 + "\"");
        System.out.println("Output 1: " + findAnagrams(s1, p1));

        String s2 = "abab", p2 = "ab";
        System.out.println("Input 2: s = \"" + s2 + "\", p = \"" + p2 + "\"");
        System.out.println("Output 2: " + findAnagrams(s2, p2));
    }
}

/*
INPUT & OUTPUT:

Input 1: s = "cbaebabacd", p = "abc"
Output 1: [0, 6]

Input 2: s = "abab", p = "ab"
Output 2: [0, 1, 2]
*/
