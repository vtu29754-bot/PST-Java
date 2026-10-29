import java.util.*;

class PST_Java_Week12_Task4 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input: " + Arrays.toString(strs));
        System.out.println("Grouped Anagrams: " + groupAnagrams(strs));
    }
}

/*
INPUT & OUTPUT:

INPUT:
["eat", "tea", "tan", "ate", "nat", "bat"]

OUTPUT:
Input: [eat, tea, tan, ate, nat, bat]
Grouped Anagrams: [[eat, tea, ate], [bat], [tan, nat]]
*/
