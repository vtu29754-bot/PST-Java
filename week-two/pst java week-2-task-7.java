import java.util.*;
import java.util.stream.Collectors;

class PST_Java_Week2_Task7 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(
            Arrays.stream(strs)
                  .collect(Collectors.groupingBy(str -> {
                      char[] chars = str.toCharArray();
                      Arrays.sort(chars);
                      return new String(chars);
                  }))
                  .values()
        );
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input 1: strs = " + Arrays.toString(strs1));
        System.out.println("Output 1: " + groupAnagrams(strs1));

        String[] strs2 = {""};
        System.out.println("Input 2: strs = " + Arrays.toString(strs2));
        System.out.println("Output 2: " + groupAnagrams(strs2));

        String[] strs3 = {"a"};
        System.out.println("Input 3: strs = " + Arrays.toString(strs3));
        System.out.println("Output 3: " + groupAnagrams(strs3));
    }
}

/*
INPUT & OUTPUT:

Input 1: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output 1: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

Input 2: strs = [""]
Output 2: [[""]]

Input 3: strs = ["a"]
Output 3: [["a"]]
*/
