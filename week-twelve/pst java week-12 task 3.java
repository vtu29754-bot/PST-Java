import java.util.*;

class PST_Java_Week12_Task3 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) count.put(n, count.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = heap.poll();
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("nums = " + Arrays.toString(nums) + ", k = " + k);
        System.out.println("Top K Frequent: " + Arrays.toString(topKFrequent(nums, k)));
    }
}

/*
INPUT & OUTPUT:

INPUT:
nums = [1, 1, 1, 2, 2, 3], k = 2

OUTPUT:
nums = [1, 1, 1, 2, 2, 3], k = 2
Top K Frequent: [2, 1]
*/
