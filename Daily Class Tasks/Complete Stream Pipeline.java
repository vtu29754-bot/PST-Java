import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompleteStreamPipeline {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 25, 30, 12, 45, 50, 25, 20);

        List<Integer> result = numbers.stream()
                                     .distinct()
                                     .filter(n -> n > 20)
                                     .map(n -> n * 2)
                                     .sorted()
                                     .collect(Collectors.toList());

        System.out.println("Input: " + numbers);
        System.out.println("Output: " + result);
    }
}

/*
INPUT & OUTPUT:

Input: [12, 25, 30, 12, 45, 50, 25, 20]
Output: [50, 60, 90, 100]

Explanation:
1. Distinct: [12, 25, 30, 45, 50, 20]
2. Greater than 20: [25, 30, 45, 50]
3. Multiply by 2: [50, 60, 90, 100]
4. Sorted ascending: [50, 60, 90, 100]
*/
