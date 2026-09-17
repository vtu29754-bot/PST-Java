import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {
    public static void main(String[] args) {
        String[] pair_left = {"john", "john", "john", "mary", "mary"};
        String[] pair_right = {"tom", "mary", "tom", "anna", "anna"};

        Set<String> set = new HashSet<>();
        System.out.println("Pairs inserted and cumulative unique count:");

        for (int i = 0; i < pair_left.length; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pair_left[i] + " " + pair_right[i] + " -> Count: " + set.size());
        }
    }
}

/*
INPUT & OUTPUT:

Pairs inserted and cumulative unique count:
john tom -> Count: 1
john mary -> Count: 2
john tom -> Count: 2
mary anna -> Count: 3
mary anna -> Count: 3
*/
