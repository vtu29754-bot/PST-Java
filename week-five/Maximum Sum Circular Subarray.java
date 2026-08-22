import java.util.Arrays;

public class MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSoFar = nums[0], currentMax = 0;
        int minSoFar = nums[0], currentMin = 0;

        for (int num : nums) {
            totalSum += num;

            currentMax = Math.max(num, currentMax + num);
            maxSoFar = Math.max(maxSoFar, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSoFar = Math.min(minSoFar, currentMin);
        }

        if (maxSoFar < 0) {
            return maxSoFar;
        }

        return Math.max(maxSoFar, totalSum - minSoFar);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, -2, 3, -2};
        System.out.println("Input 1: " + Arrays.toString(nums1));
        System.out.println("Output 1: " + maxSubarraySumCircular(nums1));

        int[] nums2 = {5, -3, 5};
        System.out.println("Input 2: " + Arrays.toString(nums2));
        System.out.println("Output 2: " + maxSubarraySumCircular(nums2));

        int[] nums3 = {-3, -2, -3};
        System.out.println("Input 3: " + Arrays.toString(nums3));
        System.out.println("Output 3: " + maxSubarraySumCircular(nums3));
    }
}

/*
INPUT & OUTPUT:

Input 1: [1, -2, 3, -2]
Output 1: 3

Input 2: [5, -3, 5]
Output 2: 10

Input 3: [-3, -2, -3]
Output 3: -2
*/
