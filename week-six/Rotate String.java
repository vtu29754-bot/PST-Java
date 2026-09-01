public class RotateString {
    public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "abcde", goal1 = "cdeab";
        System.out.println("Input 1: s = " + s1 + ", goal = " + goal1);
        System.out.println("Output 1: " + rotateString(s1, goal1));

        String s2 = "abcde", goal2 = "abced";
        System.out.println("Input 2: s = " + s2 + ", goal = " + goal2);
        System.out.println("Output 2: " + rotateString(s2, goal2));
    }
}

/*
INPUT & OUTPUT:

Input 1: s = abcde, goal = cdeab
Output 1: true

Input 2: s = abcde, goal = abced
Output 2: false
*/
