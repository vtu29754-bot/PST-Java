import java.util.Arrays;

public class Task5_KthSmallest {
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("Original Array: [7, 10, 4, 3, 20, 15]");
        System.out.println("Value of K: " + k);

        if (k > 0 && k <= arr.length) {
            int result = findKthSmallest(arr, k);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("The " + k + "rd smallest element is: " + result);
        } else {
            System.out.println("Invalid value of K.");
        }
    }
}

/*
OUTPUT:
Original Array: [7, 10, 4, 3, 20, 15]
Value of K: 3
Sorted Array: [3, 4, 7, 10, 15, 20]
The 3rd smallest element is: 7
*/