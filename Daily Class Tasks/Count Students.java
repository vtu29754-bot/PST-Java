import java.util.Arrays;
import java.util.List;

public class CountStudents {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(60, 75, 80, 90, 85, 70, 95);

        long count = scores.stream()
                           .filter(score -> score > 75)
                           .count();

        System.out.println("Input: Scores = " + scores);
        System.out.println("Output: Count of students scoring above 75 = " + count);
    }
}

/*
INPUT & OUTPUT:

Input: Scores = [60, 75, 80, 90, 85, 70, 95]
Output: Count of students scoring above 75 = 4
*/
