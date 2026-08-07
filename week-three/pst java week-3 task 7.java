import java.util.*;

class PST_Java_Week3_Task7 {
    public static String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        if (strs[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        System.out.println("Input 1: nums = " + Arrays.toString(nums1));
        System.out.println("Output 1: " + largestNumber(nums1));

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("Input 2: nums = " + Arrays.toString(nums2));
        System.out.println("Output 2: " + largestNumber(nums2));
    }
}

/*
INPUT & OUTPUT:

Input 1: nums = [10, 2]
Output 1: 210

Input 2: nums = [3, 30, 34, 5, 9]
Output 2: 9534330
*/
