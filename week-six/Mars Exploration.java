public class MarsExploration {
    public static int marsExploration(String s) {
        int count = 0;
        String target = "SOS";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "SOSSPSSQSSOR";
        System.out.println("Input 1: " + s1);
        System.out.println("Output 1: " + marsExploration(s1));

        String s2 = "SOSSOT";
        System.out.println("Input 2: " + s2);
        System.out.println("Output 2: " + marsExploration(s2));
    }
}

/*
INPUT & OUTPUT:

Input 1: SOSSPSSQSSOR
Output 1: 3

Input 2: SOSSOT
Output 2: 1
*/
