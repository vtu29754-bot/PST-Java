import java.util.Arrays;
import java.util.stream.IntStream;

class PST_Java_Week2_Task1 {
    public static int[] buildArray(int[] nums) {
        return IntStream.range(0, nums.length)
                        .map(i -> nums[nums[i]])
                        .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        System.out.println("Input 1: " + Arrays.toString(nums1));
        System.out.println("Output 1: " + Arrays.toString(buildArray(nums1)));

        int[] nums2 = {5, 0, 1, 2, 3, 4};
        System.out.println("Input 2: " + Arrays.toString(nums2));
        System.out.println("Output 2: " + Arrays.toString(buildArray(nums2)));
    }
}

/*
INPUT & OUTPUT:

Input 1: [0, 2, 1, 5, 3, 4]
Output 1: [0, 1, 2, 4, 5, 3]

Input 2: [5, 0, 1, 2, 3, 4]
Output 2: [4, 5, 0, 1, 2, 3]
*/
