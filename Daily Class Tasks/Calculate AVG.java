import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class CalculateAVG {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(75, 80, 65, 90, 85);

        IntSummaryStatistics stats = marks.stream()
                                          .mapToInt(Integer::intValue)
                                          .summaryStatistics();

        System.out.println("Input: " + marks);
        System.out.println("Output:");
        System.out.println("Total: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("MAX: " + stats.getMax());
        System.out.println("MIN: " + stats.getMin());
    }
}

/*
INPUT & OUTPUT:

Input: [75, 80, 65, 90, 85]
Output:
Total: 395
Average: 79.0
MAX: 90
MIN: 65
*/
