import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7_GroupAnagrams {
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
        System.out.println("Input 1: " + Arrays.toString(strs1));
        System.out.println("Output 1: " + groupAnagrams(strs1));

        String[] strs2 = {""};
        System.out.println("Input 2: " + Arrays.toString(strs2));
        System.out.println("Output 2: " + groupAnagrams(strs2));

        String[] strs3 = {"a"};
        System.out.println("Input 3: " + Arrays.toString(strs3));
        System.out.println("Output 3: " + groupAnagrams(strs3));
    }
}
