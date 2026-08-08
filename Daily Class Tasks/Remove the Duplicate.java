import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 40);

        List<Integer> result = numbers.stream()
                                     .distinct()
                                     .collect(Collectors.toList());

        System.out.println("Input: " + numbers);
        System.out.println("Output: " + result);
    }
}

/*
INPUT & OUTPUT:

Input: [10, 20, 20, 30, 40]
Output: [10, 20, 30, 40]
*/
