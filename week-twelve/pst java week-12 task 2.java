import java.util.*;

class PST_Java_Week12_Task2 {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : stringList) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (String q : queries) {
            result.add(freqMap.getOrDefault(q, 0));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");
        System.out.println("String List: " + stringList);
        System.out.println("Queries: " + queries);
        System.out.println("Query Counts: " + matchingStrings(stringList, queries));
    }
}

/*
INPUT & OUTPUT:

INPUT:
String List: ["aba", "baba", "aba", "xzxb"]
Queries: ["aba", "xzxb", "ab"]

OUTPUT:
String List: [aba, baba, aba, xzxb]
Queries: [aba, xzxb, ab]
Query Counts: [2, 1, 0]
*/
