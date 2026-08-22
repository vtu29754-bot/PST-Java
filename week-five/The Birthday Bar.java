import java.util.Arrays;
import java.util.List;

public class TheBirthdayBar {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;

        if (s.size() < m) return 0;

        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        if (sum == d) count++;

        for (int i = m; i < s.size(); i++) {
            sum += s.get(i) - s.get(i - m);
            if (sum == d) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> s1 = Arrays.asList(2, 2, 1, 3, 2);
        int d1 = 4, m1 = 2;
        System.out.println("Input 1: s = " + s1 + ", d = " + d1 + ", m = " + m1);
        System.out.println("Output 1: " + birthday(s1, d1, m1));

        List<Integer> s2 = Arrays.asList(1, 2, 1, 3, 2);
        int d2 = 3, m2 = 2;
        System.out.println("Input 2: s = " + s2 + ", d = " + d2 + ", m = " + m2);
        System.out.println("Output 2: " + birthday(s2, d2, m2));
    }
}

/*
INPUT & OUTPUT:

Input 1: s = [2, 2, 1, 3, 2], d = 4, m = 2
Output 1: 2

Input 2: s = [1, 2, 1, 3, 2], d = 3, m = 2
Output 2: 2
*/
