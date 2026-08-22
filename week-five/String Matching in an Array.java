import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"mass", "as", "hero", "superhero"};
        System.out.println("Input 1: " + Arrays.toString(words1));
        System.out.println("Output 1: " + stringMatching(words1));

        String[] words2 = {"leetcode", "et", "code"};
        System.out.println("Input 2: " + Arrays.toString(words2));
        System.out.println("Output 2: " + stringMatching(words2));

        String[] words3 = {"blue", "green", "bu"};
        System.out.println("Input 3: " + Arrays.toString(words3));
        System.out.println("Output 3: " + stringMatching(words3));
    }
}

/*
INPUT & OUTPUT:

Input 1: [mass, as, hero, superhero]
Output 1: [as, hero]

Input 2: [leetcode, et, code]
Output 2: [et, code]

Input 3: [blue, green, bu]
Output 3: []
*/
