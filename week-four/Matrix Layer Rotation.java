import java.util.ArrayList;
import java.util.List;

public class MatrixLayerRotation {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;
        
        for (int l = 0; l < layers; l++) {
            List<Integer> ring = new ArrayList<>();
            
            // Extract ring elements counter-clockwise
            for (int j = l; j < n - l; j++) ring.add(matrix.get(l).get(j));
            for (int i = l + 1; i < m - l - 1; i++) ring.add(matrix.get(i).get(n - 1 - l));
            for (int j = n - 1 - l; j >= l; j--) ring.add(matrix.get(m - 1 - l).get(j));
            for (int i = m - 2 - l; i > l; i--) ring.add(matrix.get(i).get(l));
            
            int len = ring.size();
            int shift = r % len;
            
            // Rotate ring elements anti-clockwise
            int idx = 0;
            for (int j = l; j < n - l; j++) matrix.get(l).set(j, ring.get((idx++ + shift) % len));
            for (int i = l + 1; i < m - l - 1; i++) matrix.get(i).set(n - 1 - l, ring.get((idx++ + shift) % len));
            for (int j = n - 1 - l; j >= l; j--) matrix.get(m - 1 - l).set(j, ring.get((idx++ + shift) % len));
            for (int i = m - 2 - l; i > l; i--) matrix.get(i).set(l, ring.get((idx++ + shift) % len));
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(List.of(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(List.of(9, 10, 11, 12)));
        matrix.add(new ArrayList<>(List.of(13, 14, 15, 16)));
        int r = 2;

        System.out.println("Input Matrix:");
        for (List<Integer> row : matrix) System.out.println(row);

        matrixRotation(matrix, r);

        System.out.println("\nOutput Matrix after " + r + " rotations:");
        for (List<Integer> row : matrix) System.out.println(row);
    }
}

/*
INPUT & OUTPUT:

Input Matrix:
[1, 2, 3, 4]
[5, 6, 7, 8]
[9, 10, 11, 12]
[13, 14, 15, 16]

Output Matrix after 2 rotations:
[3, 4, 8, 12]
[2, 11, 10, 16]
[1, 7, 6, 15]
[5, 9, 13, 14]
*/
