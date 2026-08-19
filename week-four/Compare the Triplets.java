import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        
        return Arrays.asList(aliceScore, bobScore);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        
        List<Integer> result = compareTriplets(a, b);
        System.out.println("Input: a = " + a + ", b = " + b);
        System.out.println("Output: " + result);
    }
}

/*
INPUT & OUTPUT:

Input: a = [5, 6, 7], b = [3, 6, 10]
Output: [1, 1]
*/
