import java.util.Arrays;

public class Task5_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        return Arrays.stream(nums)
                     .reduce(new int[]{Integer.MIN_VALUE, 0}, (acc, x) -> {
                         int currentSum = Math.max(x, acc[1] + x);
                         int maxSoFar = Math.max(acc[0], currentSum);
                         return new int[]{maxSoFar, currentSum};
                     }, (a, b) -> a)[0];
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input 1: nums = " + Arrays.toString(nums1));
        System.out.println("Output 1: " + maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println("Input 2: nums = " + Arrays.toString(nums2));
        System.out.println("Output 2: " + maxSubArray(nums2));

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Input 3: nums = " + Arrays.toString(nums3));
        System.out.println("Output 3: " + maxSubArray(nums3));
    }
}
