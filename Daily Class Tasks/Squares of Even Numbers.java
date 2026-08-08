import java.util.Arrays;
import java.util.List;

public class SquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Input: " + numbers);
        System.out.println("Output:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(System::println);
    }
}

/*
INPUT & OUTPUT:

Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output:
4
16
36
64
100
*/
