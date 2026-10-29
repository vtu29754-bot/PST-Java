import java.util.HashMap;
import java.util.Map;

class PST_Java_Week12_Task6 {
    public static int maxDistinctInWindow(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxDistinct = 0;
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        maxDistinct = map.size();
        for (int i = k; i < nums.length; i++) {
            int out = nums[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) map.remove(out);
            int in = nums[i];
            map.put(in, map.getOrDefault(in, 0) + 1);
            maxDistinct = Math.max(maxDistinct, map.size());
        }
        return maxDistinct;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println("Array: [1, 2, 1, 3, 4, 2, 3], Window K = " + k);
        System.out.println("Max Distinct Elements in any window: " + maxDistinctInWindow(nums, k));
    }
}

/*
INPUT & OUTPUT:

INPUT:
nums = [1, 2, 1, 3, 4, 2, 3], k = 4

OUTPUT:
Array: [1, 2, 1, 3, 4, 2, 3], Window K = 4
Max Distinct Elements in any window: 4
*/
