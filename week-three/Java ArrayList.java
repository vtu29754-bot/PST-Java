import java.util.*;

class PST_Java_Week3_Task6 {
    public static void processQueries(List<List<Integer>> lines, List<int[]> queries) {
        for (int[] q : queries) {
            int x = q[0] - 1; // Convert 1-based index to 0-based
            int y = q[1] - 1;

            if (x >= 0 && x < lines.size() && y >= 0 && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lines = new ArrayList<>();
        lines.add(Arrays.asList(41, 77, 74, 22, 44));
        lines.add(Arrays.asList(12));
        lines.add(Arrays.asList(37, 34, 36, 52));
        lines.add(new ArrayList<>());
        lines.add(Arrays.asList(20, 22, 33));

        List<int[]> queries = Arrays.asList(
            new int[]{1, 3},
            new int[]{3, 4},
            new int[]{3, 1},
            new int[]{4, 3},
            new int[]{5, 5}
        );

        System.out.println("Output:");
        processQueries(lines, queries);
    }
}

/*
INPUT & OUTPUT:

Queries: (1,3), (3,4), (3,1), (4,3), (5,5)

Output:
74
52
37
ERROR!
ERROR!
*/
