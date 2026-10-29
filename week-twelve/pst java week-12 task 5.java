import java.util.*;

class PST_Java_Week12_Task5 {
    public static List<Integer> freqQuery(List<int[]> queries) {
        Map<Integer, Integer> valToFreq = new HashMap<>();
        Map<Integer, Integer> freqCount = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int[] q : queries) {
            int type = q[0];
            int val = q[1];
            if (type == 1) { // Insert
                int oldFreq = valToFreq.getOrDefault(val, 0);
                int newFreq = oldFreq + 1;
                valToFreq.put(val, newFreq);
                if (oldFreq > 0) freqCount.put(oldFreq, freqCount.get(oldFreq) - 1);
                freqCount.put(newFreq, freqCount.getOrDefault(newFreq, 0) + 1);
            } else if (type == 2) { // Delete
                if (valToFreq.containsKey(val) && valToFreq.get(val) > 0) {
                    int oldFreq = valToFreq.get(val);
                    int newFreq = oldFreq - 1;
                    valToFreq.put(val, newFreq);
                    freqCount.put(oldFreq, freqCount.get(oldFreq) - 1);
                    if (newFreq > 0) freqCount.put(newFreq, freqCount.getOrDefault(newFreq, 0) + 1);
                }
            } else if (type == 3) { // Check frequency
                result.add(freqCount.getOrDefault(val, 0) > 0 ? 1 : 0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<int[]> queries = Arrays.asList(
            new int[]{1, 1},
            new int[]{2, 2},
            new int[]{3, 2},
            new int[]{1, 1},
            new int[]{1, 1},
            new int[]{2, 1},
            new int[]{3, 2}
        );
        System.out.println("Query Results: " + freqQuery(queries));
    }
}

/*
INPUT & OUTPUT:

INPUT:
Operations:
1 1 (insert 1)
2 2 (delete 2)
3 2 (check freq 2)
1 1 (insert 1)
1 1 (insert 1)
2 1 (delete 1)
3 2 (check freq 2)

OUTPUT:
Query Results: [0, 1]
*/
