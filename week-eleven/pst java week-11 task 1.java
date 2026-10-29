import java.util.Arrays;

class PST_Java_Week11_Task1 {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("Input 1: " + Arrays.toString(nums1));
        System.out.println("Output 1: " + majorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Input 2: " + Arrays.toString(nums2));
        System.out.println("Output 2: " + majorityElement(nums2));
    }
}

/*
INPUT & OUTPUT:

INPUT:
nums1 = [3, 2, 3]
nums2 = [2, 2, 1, 1, 1, 2, 2]

OUTPUT:
Input 1: [3, 2, 3]
Output 1: 3
Input 2: [2, 2, 1, 1, 1, 2, 2]
Output 2: 2
*/
