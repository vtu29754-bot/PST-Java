import java.util.Arrays;

class PST_Java_Week2_Task5 {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
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

/*
INPUT & OUTPUT:

Input 1: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output 1: 6

Input 2: nums = [1]
Output 2: 1

Input 3: nums = [5, 4, -1, 7, 8]
Output 3: 23
*/
