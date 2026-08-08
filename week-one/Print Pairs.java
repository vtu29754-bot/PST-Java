public class Task6_PrintPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        System.out.println("Array elements: [1, 2, 3, 4]");
        System.out.println("All possible unique pairs:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}

/*
OUTPUT:
Array elements: [1, 2, 3, 4]
All possible unique pairs:
(1, 2)
(1, 3)
(1, 4)
(2, 3)
(2, 4)
(3, 4)
*/