import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Task9_JavaDeque {
    public static int maxUniqueInSubarrays(int[] nums, int m) {
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        int maxUnique = 0;

        for (int num : nums) {
            deque.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() == m) {
                if (map.size() > maxUnique) {
                    maxUnique = map.size();
                }
                int first = deque.remove();
                if (map.get(first) == 1) {
                    map.remove(first);
                } else {
                    map.put(first, map.get(first) - 1);
                }
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 2, 3, 2};
        int m = 3;
        System.out.println("Input: N = " + nums.length + ", M = " + m + ", Array = " + Arrays.toString(nums));
        System.out.println("Output: " + maxUniqueInSubarrays(nums, m));
    }
}
