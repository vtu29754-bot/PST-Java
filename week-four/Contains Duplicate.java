import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Input 1: " + Arrays.toString(nums1));
        System.out.println("Output 1: " + containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Input 2: " + Arrays.toString(nums2));
        System.out.println("Output 2: " + containsDuplicate(nums2));
    }
}

/*
INPUT & OUTPUT:

Input 1: [1, 2, 3, 1]
Output 1: true

Input 2: [1, 2, 3, 4]
Output 2: false
*/
