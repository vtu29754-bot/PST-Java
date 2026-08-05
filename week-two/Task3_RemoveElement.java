import java.util.Arrays;

public class Task3_RemoveElement {
    public static int[] removeElement(int[] nums, int val) {
        return Arrays.stream(nums)
                     .filter(x -> x != val)
                     .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int[] result1 = removeElement(nums1, val1);
        System.out.println("Input 1: nums = " + Arrays.toString(nums1) + ", val = " + val1);
        System.out.println("Output 1: k = " + result1.length + ", nums = " + Arrays.toString(result1));

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int[] result2 = removeElement(nums2, val2);
        System.out.println("Input 2: nums = " + Arrays.toString(nums2) + ", val = " + val2);
        System.out.println("Output 2: k = " + result2.length + ", nums = " + Arrays.toString(result2));
    }
}
