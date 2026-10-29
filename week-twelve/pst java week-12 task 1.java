import java.util.*;

class PST_Java_Week12_Task1 {
    public static void countHashtags(List<String> tags) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String tag : tags) {
            freqMap.put(tag, freqMap.getOrDefault(tag, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return Integer.compare(b.getValue(), a.getValue());
            }
            return a.getKey().compareTo(b.getKey());
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> tags = Arrays.asList("#java", "#ai", "#coding", "#java", "#ai", "#python");
        System.out.println("Input Hashtags: " + tags);
        System.out.println("Result (Frequency Descending, Lexicographical Ascending):");
        countHashtags(tags);
    }
}

/*
INPUT & OUTPUT:

INPUT:
["#java", "#ai", "#coding", "#java", "#ai", "#python"]

OUTPUT:
Input Hashtags: [#java, #ai, #coding, #java, #ai, #python]
Result (Frequency Descending, Lexicographical Ascending):
#ai -> 2
#java -> 2
#coding -> 1
#python -> 1
*/
