import java.util.ArrayList;
import java.util.List;

class PST_Java_Week11_Task6 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println("numRows = " + numRows);
        System.out.println("Pascal's Triangle: " + generate(numRows));
    }
}

/*
INPUT & OUTPUT:

INPUT:
numRows = 5

OUTPUT:
numRows = 5
Pascal's Triangle: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
*/
