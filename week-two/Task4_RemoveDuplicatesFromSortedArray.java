import java.util.Arrays;

public class Task4_RemoveDuplicatesFromSortedArray {
    public static int[] removeDuplicates(int[] nums) {
        return Arrays.stream(nums)
                     .distinct()
                     .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] result1 = removeDuplicates(nums1);
        System.out.println("Input 1: nums = " + Arrays.toString(nums1));
        System.out.println("Output 1: k = " + result1.length + ", nums = " + Arrays.toString(result1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] result2 = removeDuplicates(nums2);
        System.out.println("Input 2: nums = " + Arrays.toString(nums2));
        System.out.println("Output 2: k = " + result2.length + ", nums = " + Arrays.toString(result2));
    }
}
