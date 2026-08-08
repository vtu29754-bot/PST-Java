import java.util.*;

class PST_Java_Week3_Task9 {
    public static String customSortString(String order, String s) {
        Map<Character, Integer> rank = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            rank.put(order.charAt(i), i);
        }

        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, (a, b) -> {
            int rankA = rank.getOrDefault(a, 26);
            int rankB = rank.getOrDefault(b, 26);
            return Integer.compare(rankA, rankB);
        });

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String order1 = "cba", s1 = "abcd";
        System.out.println("Input 1: order = " + order1 + ", s = " + s1);
        System.out.println("Output 1: " + customSortString(order1, s1));

        String order2 = "bcafg", s2 = "abcd";
        System.out.println("Input 2: order = " + order2 + ", s = " + s2);
        System.out.println("Output 2: " + customSortString(order2, s2));
    }
}

/*
INPUT & OUTPUT:

Input 1: order = cba, s = abcd
Output 1: cbad

Input 2: order = bcafg, s = abcd
Output 2: bcad
*/
