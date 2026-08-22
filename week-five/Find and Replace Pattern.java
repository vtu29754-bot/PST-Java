import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private static boolean matches(String word, String pattern) {
        if (word.length() != pattern.length()) return false;

        Map<Character, Character> wToP = new HashMap<>();
        Map<Character, Character> pToW = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (!wToP.containsKey(w)) {
                wToP.put(w, p);
            }
            if (!pToW.containsKey(p)) {
                pToW.put(p, w);
            }

            if (wToP.get(w) != p || pToW.get(p) != w) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words1 = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern1 = "abb";
        System.out.println("Input 1: words = " + Arrays.toString(words1) + ", pattern = \"" + pattern1 + "\"");
        System.out.println("Output 1: " + findAndReplacePattern(words1, pattern1));

        String[] words2 = {"a", "b", "c"};
        String pattern2 = "a";
        System.out.println("Input 2: words = " + Arrays.toString(words2) + ", pattern = \"" + pattern2 + "\"");
        System.out.println("Output 2: " + findAndReplacePattern(words2, pattern2));
    }
}

/*
INPUT & OUTPUT:

Input 1: words = [abc, deq, mee, aqq, dkd, ccc], pattern = "abb"
Output 1: [mee, aqq]

Input 2: words = [a, b, c], pattern = "a"
Output 2: [a, b, c]
*/
