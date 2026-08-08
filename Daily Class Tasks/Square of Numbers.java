import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> result = numbers.stream()
                                     .map(n -> n * n)
                                     .collect(Collectors.toList());

        System.out.println("Input: " + numbers);
        System.out.println("Output: " + result);
    }
}

/*
INPUT & OUTPUT:

Input: [2, 4, 6, 8, 10]
Output: [4, 16, 36, 64, 100]
*/
