public class Task4_MaxElement {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 33, 97, 21, 64};
        
        System.out.println("Array: [45, 12, 89, 33, 97, 21, 64]");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);
    }
}



/*
OUTPUT:
Array: [45, 12, 89, 33, 97, 21, 64]
The maximum element in the array is: 97
*/