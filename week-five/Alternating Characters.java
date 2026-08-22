public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        int deletions = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        return deletions;
    }

    public static void main(String[] args) {
        String s1 = "AAAA";
        System.out.println("Input 1: " + s1);
        System.out.println("Output 1: " + alternatingCharacters(s1));

        String s2 = "BBBBB";
        System.out.println("Input 2: " + s2);
        System.out.println("Output 2: " + alternatingCharacters(s2));

        String s3 = "ABABABAB";
        System.out.println("Input 3: " + s3);
        System.out.println("Output 3: " + alternatingCharacters(s3));

        String s4 = "BABABA";
        System.out.println("Input 4: " + s4);
        System.out.println("Output 4: " + alternatingCharacters(s4));

        String s5 = "AAABBB";
        System.out.println("Input 5: " + s5);
        System.out.println("Output 5: " + alternatingCharacters(s5));
    }
}

/*
INPUT & OUTPUT:

Input 1: AAAA
Output 1: 3

Input 2: BBBBB
Output 2: 4

Input 3: ABABABAB
Output 3: 0

Input 4: BABABA
Output 4: 0

Input 5: AAABBB
Output 5: 4
*/
