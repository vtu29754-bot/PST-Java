import java.util.TreeSet;

class PST_Java_Week10_Task7 {
    public static void main(String[] args) {
        int[] inputMarks = {88, 65, 92, 88, 74, 65, 99, 74};
        TreeSet<Integer> uniqueSorted = new TreeSet<>();
        for (int mark : inputMarks) {
            uniqueSorted.add(mark);
        }
        System.out.println("Original Marks with duplicates: [88, 65, 92, 88, 74, 65, 99, 74]");
        System.out.println("Unique Marks in Ascending Order: " + uniqueSorted);
    }
}

/*
INPUT & OUTPUT:

INPUT:
Marks entered: [88, 65, 92, 88, 74, 65, 99, 74]

OUTPUT:
Original Marks with duplicates: [88, 65, 92, 88, 74, 65, 99, 74]
Unique Marks in Ascending Order: [65, 74, 88, 92, 99]
*/
