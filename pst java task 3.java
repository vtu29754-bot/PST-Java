public class Task3_BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArr = {12, 25, 37, 48, 59, 64, 78, 90};
        int target = 48;

        System.out.println("Sorted Array: [12, 25, 37, 48, 59, 64, 78, 90]");
        System.out.println("Target element to search: " + target);

        int result = binarySearch(sortedArr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}



/*
OUTPUT:
Sorted Array: [12, 25, 37, 48, 59, 64, 78, 90]
Target element to search: 48
Element found at index: 3
*/