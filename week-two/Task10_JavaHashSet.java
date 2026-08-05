import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task10_JavaHashSet {
    public static void processPairs(String[][] pairs) {
        Set<String> set = new HashSet<>();
        for (String[] pair : pairs) {
            set.add(pair[0] + " " + pair[1]);
            System.out.println(set.size());
        }
    }

    public static void main(String[] args) {
        String[][] pairs = {
            {"john", "tom"},
            {"john", "mary"},
            {"john", "tom"},
            {"mary", "anna"},
            {"mary", "anna"}
        };

        System.out.println("Input Pairs: " + Arrays.deepToString(pairs));
        System.out.println("Output (Unique count after each pair):");
        processPairs(pairs);
    }
}
