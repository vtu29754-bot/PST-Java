import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class PST_Java_Week11_Task8 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output Indices: " + Arrays.toString(result));
    }
}

/*
INPUT & OUTPUT:

INPUT:
nums = [2, 7, 11, 15], target = 9

OUTPUT:
nums = [2, 7, 11, 15], target = 9
Output Indices: [0, 1]
*/
