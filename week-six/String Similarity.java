public class StringSimilarity {
    public static long stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;
        long totalSimilarity = n;

        for (int i = 1; i < n; i++) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
            totalSimilarity += z[i];
        }

        return totalSimilarity;
    }

    public static void main(String[] args) {
        String s1 = "ababaa";
        System.out.println("Input 1: " + s1);
        System.out.println("Output 1: " + stringSimilarity(s1));

        String s2 = "aa";
        System.out.println("Input 2: " + s2);
        System.out.println("Output 2: " + stringSimilarity(s2));
    }
}

/*
INPUT & OUTPUT:

Input 1: ababaa
Output 1: 11

Input 2: aa
Output 2: 3
*/
