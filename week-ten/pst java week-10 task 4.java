import java.util.ArrayList;
import java.util.Collections;

class PST_Java_Week10_Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(95);
        marks.add(88);
        marks.add(64);
        marks.add(92);
        System.out.println("Student Marks: " + marks);
        int highest = Collections.max(marks);
        System.out.println("Highest Mark: " + highest);
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.size();
        System.out.printf("Average Mark: %.2f\n", average);
    }
}

/*
INPUT & OUTPUT:

INPUT:
Marks: [78, 95, 88, 64, 92]

OUTPUT:
Student Marks: [78, 95, 88, 64, 92]
Highest Mark: 95
Average Mark: 83.40
*/
