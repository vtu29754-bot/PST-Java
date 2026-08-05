import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class PST_Java_Week2_Task8 {
    public static int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
                     .boxed()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet().stream()
                     .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                     .limit(k)
                     .mapToInt(Map.Entry::getKey)
                     .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println("Input 1: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output 1: " + Arrays.toString(topKFrequent(nums1, k1)));

        int[] nums2 = {1};
        int k2 = 1;
        System.out.println("Input 2: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output 2: " + Arrays.toString(topKFrequent(nums2, k2)));
    }
}

/*
INPUT & OUTPUT:

Input 1: nums = [1, 1, 1, 2, 2, 3], k = 2
Output 1: [1, 2]

Input 2: nums = [1], k = 1
Output 2: [1]
*/
