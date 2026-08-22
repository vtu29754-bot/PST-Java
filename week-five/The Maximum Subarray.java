import java.util.Arrays;
import java.util.List;

public class TheMaximumSubarray {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarraySum = arr.get(0);
        int currentSum = arr.get(0);
        
        int maxSubsequenceSum = 0;
        int maxElement = Integer.MIN_VALUE;
        boolean hasPositive = false;

        for (int num : arr) {
            if (num > 0) {
                maxSubsequenceSum += num;
                hasPositive = true;
            }
            maxElement = Math.max(maxElement, num);
        }

        if (!hasPositive) {
            maxSubsequenceSum = maxElement;
        }

        for (int i = 1; i < arr.size(); i++) {
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));
            maxSubarraySum = Math.max(maxSubarraySum, currentSum);
        }

        return Arrays.asList(maxSubarraySum, maxSubsequenceSum);
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4);
        System.out.println("Input 1: " + arr1);
        System.out.println("Output 1: " + maxSubarray(arr1));

        List<Integer> arr2 = Arrays.asList(2, -1, 2, 3, 4, -5);
        System.out.println("Input 2: " + arr2);
        System.out.println("Output 2: " + maxSubarray(arr2));

        List<Integer> arr3 = Arrays.asList(-2, -3, -1, -4);
        System.out.println("Input 3: " + arr3);
        System.out.println("Output 3: " + maxSubarray(arr3));
    }
}

/*
INPUT & OUTPUT:

Input 1: [1, 2, 3, 4]
Output 1: [10, 10]

Input 2: [2, -1, 2, 3, 4, -5]
Output 2: [10, 11]

Input 3: [-2, -3, -1, -4]
Output 3: [-1, -1]
*/
