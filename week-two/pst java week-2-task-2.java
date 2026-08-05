import java.util.Arrays;
import java.util.stream.IntStream;

class PST_Java_Week2_Task2 {
    public static int[] shuffle(int[] nums, int n) {
        return IntStream.range(0, 2 * n)
                        .map(i -> (i % 2 == 0) ? nums[i / 2] : nums[n + i / 2])
                        .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        System.out.println("Input 1: nums = " + Arrays.toString(nums1) + ", n = " + n1);
        System.out.println("Output 1: " + Arrays.toString(shuffle(nums1, n1)));

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        System.out.println("Input 2: nums = " + Arrays.toString(nums2) + ", n = " + n2);
        System.out.println("Output 2: " + Arrays.toString(shuffle(nums2, n2)));
    }
}

/*
INPUT & OUTPUT:

Input 1: nums = [2, 5, 1, 3, 4, 7], n = 3
Output 1: [2, 3, 5, 4, 1, 7]

Input 2: nums = [1, 2, 3, 4, 4, 3, 2, 1], n = 4
Output 2: [1, 4, 2, 3, 3, 2, 4, 1]
*/
