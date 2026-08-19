import java.util.Arrays;

public class MatrixBlockSum {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] pref = new int[m + 1][n + 1];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pref[i + 1][j + 1] = mat[i][j] + pref[i][j + 1] + pref[i + 1][j] - pref[i][j];
            }
        }
        
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);
                
                ans[i][j] = pref[r2 + 1][c2 + 1] - pref[r1][c2 + 1] - pref[r2 + 1][c1] + pref[r1][c1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 1;
        
        int[][] result = matrixBlockSum(mat, k);
        System.out.println("Input Matrix: " + Arrays.deepToString(mat) + ", k = " + k);
        System.out.println("Output Matrix: " + Arrays.deepToString(result));
    }
}

/*
INPUT & OUTPUT:

Input Matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]], k = 1
Output Matrix: [[12, 21, 16], [27, 45, 36], [24, 39, 28]]
*/
