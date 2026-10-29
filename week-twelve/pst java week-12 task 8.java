import java.util.*;

class PST_Java_Week12_Task8 {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
            if (count.get(w1).equals(count.get(w2))) {
                return w2.compareTo(w1);
            }
            return count.get(w1) - count.get(w2);
        });
        for (String word : count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }
        List<String> ans = new ArrayList<>();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println("Words: " + Arrays.toString(words) + ", k = " + k);
        System.out.println("Top " + k + " words: " + topKFrequent(words, k));
    }
}

/*
INPUT & OUTPUT:

INPUT:
words = ["i", "love", "leetcode", "i", "love", "coding"], k = 2

OUTPUT:
Words: [i, love, leetcode, i, love, coding], k = 2
Top 2 words: [i, love]
*/
