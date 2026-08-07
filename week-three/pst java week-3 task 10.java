import java.util.*;

class PST_Java_Week3_Task10 {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(heights[b], heights[a]));

        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[indices[i]];
        }
        return sortedNames;
    }

    public static void main(String[] args) {
        String[] names1 = {"Mary", "John", "Emma"};
        int[] heights1 = {180, 165, 170};
        System.out.println("Input 1: names = " + Arrays.toString(names1) + ", heights = " + Arrays.toString(heights1));
        System.out.println("Output 1: " + Arrays.toString(sortPeople(names1, heights1)));

        String[] names2 = {"Alice", "Bob", "Bob"};
        int[] heights2 = {155, 185, 150};
        System.out.println("Input 2: names = " + Arrays.toString(names2) + ", heights = " + Arrays.toString(heights2));
        System.out.println("Output 2: " + Arrays.toString(sortPeople(names2, heights2)));
    }
}

/*
INPUT & OUTPUT:

Input 1: names = ["Mary", "John", "Emma"], heights = [180, 165, 170]
Output 1: ["Mary", "Emma", "John"]

Input 2: names = ["Alice", "Bob", "Bob"], heights = [155, 185, 150]
Output 2: ["Bob", "Alice", "Bob"]
*/
