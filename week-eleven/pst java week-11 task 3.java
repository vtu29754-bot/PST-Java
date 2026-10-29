import java.util.HashMap;
import java.util.Map;

class PST_Java_Week11_Task3 {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            first.putIfAbsent(num, i);
            last.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int degree = 0;
        for (int freq : count.values()) {
            degree = Math.max(degree, freq);
        }

        int minLen = nums.length;
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                minLen = Math.min(minLen, last.get(num) - first.get(num) + 1);
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        System.out.println("Input: [1, 2, 2, 3, 1, 4, 2]");
        System.out.println("Shortest Subarray with Same Degree: " + findShortestSubArray(nums));
    }
}

/*
INPUT & OUTPUT:

INPUT:
nums = [1, 2, 2, 3, 1, 4, 2]

OUTPUT:
Input: [1, 2, 2, 3, 1, 4, 2]
Shortest Subarray with Same Degree: 6
*/
