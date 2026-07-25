public class Task2_ArrayIndexAccess {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;

        System.out.println("Array: [10, 20, 30, 40, 50]");
        System.out.println("Target Index: " + index);

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}



/*
OUTPUT:
Array: [10, 20, 30, 40, 50]
Target Index: 2
Element at index 2 is: 30
*/
