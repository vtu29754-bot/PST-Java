import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PST_Java_Week11_Task5 {
    public static void main(String[] args) {
        List<List<Integer>> lines = new ArrayList<>();
        lines.add(Arrays.asList(41, 77, 74, 22, 44));
        lines.add(Arrays.asList(12));
        lines.add(Arrays.asList(4, 78, 67, 89, 0));
        lines.add(new ArrayList<>());
        lines.add(Arrays.asList(0, 100));

        int[][] queries = {
            {1, 3},
            {3, 4},
            {3, 1},
            {4, 3},
            {5, 5}
        };

        for (int[] q : queries) {
            int lineIdx = q[0] - 1;
            int posIdx = q[1] - 1;
            if (lineIdx < lines.size() && posIdx < lines.get(lineIdx).size()) {
                System.out.println(lines.get(lineIdx).get(posIdx));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}

/*
INPUT & OUTPUT:

INPUT:
Lines:
1: 41 77 74 22 44
2: 12
3: 4 78 67 89 0
4: 
5: 0 100
Queries:
(1, 3), (3, 4), (3, 1), (4, 3), (5, 5)

OUTPUT:
74
89
4
ERROR!
ERROR!
*/
