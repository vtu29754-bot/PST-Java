import java.util.*;

class PST_Java_Week2_Task9 {
    public static int maxUniqueSubarray(int[] nums, int m) {
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxUnique = 0;

        for (int num : nums) {
            deque.addLast(num);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, freqMap.size());
                int removed = deque.removeFirst();
                if (freqMap.get(removed) == 1) {
                    freqMap.remove(removed);
                } else {
                    freqMap.put(removed, freqMap.get(removed) - 1);
                }
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 2, 3, 2};
        int m = 3;
        System.out.println("Input: Array = " + Arrays.toString(nums) + ", Subarray Size (m) = " + m);
        System.out.println("Output: " + maxUniqueSubarray(nums, m));
    }
}

/*
INPUT & OUTPUT:

Input: Array = [5, 3, 5, 2, 3, 2], Subarray Size (m) = 3
Output: 3

Explanation:
Subarrays of size 3:
[5, 3, 5] -> 2 unique
[3, 5, 2] -> 3 unique
[5, 2, 3] -> 3 unique
[2, 3, 2] -> 2 unique
Maximum unique elements in any subarray of size 3 is 3.
*/
