import java.util.ArrayList;
import java.util.List;

public class NaiveAlgorithmForPatternSearching {
    public static List<Integer> searchPattern(String txt, String pat) {
        List<Integer> result = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String txt1 = "AABAACAADAABAAABAA";
        String pat1 = "AABA";
        System.out.println("Input 1: txt = \"" + txt1 + "\", pat = \"" + pat1 + "\"");
        System.out.println("Output 1: Pattern found at index(es): " + searchPattern(txt1, pat1));

        String txt2 = "THIS IS A TEST TEXT";
        String pat2 = "TEST";
        System.out.println("Input 2: txt = \"" + txt2 + "\", pat = \"" + pat2 + "\"");
        System.out.println("Output 2: Pattern found at index(es): " + searchPattern(txt2, pat2));
    }
}

/*
INPUT & OUTPUT:

Input 1: txt = "AABAACAADAABAAABAA", pat = "AABA"
Output 1: Pattern found at index(es): [0, 9, 13]

Input 2: txt = "THIS IS A TEST TEXT", pat = "TEST"
Output 2: Pattern found at index(es): [10]
*/
