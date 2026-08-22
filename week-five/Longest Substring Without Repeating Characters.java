import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= left) {
                left = lastSeen.get(currentChar) + 1;
            }

            lastSeen.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println("Input 1: \"" + s1 + "\"");
        System.out.println("Output 1: " + lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";
        System.out.println("Input 2: \"" + s2 + "\"");
        System.out.println("Output 2: " + lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println("Input 3: \"" + s3 + "\"");
        System.out.println("Output 3: " + lengthOfLongestSubstring(s3));
    }
}

/*
INPUT & OUTPUT:

Input 1: "abcabcbb"
Output 1: 3

Input 2: "bbbbb"
Output 2: 1

Input 3: "pwwkew"
Output 3: 3
*/
