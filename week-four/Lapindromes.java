import java.util.Arrays;

public class Lapindromes {
    public static String isLapindrome(String s) {
        int len = s.length();
        String left = s.substring(0, len / 2);
        String right = s.substring((len + 1) / 2);
        
        char[] leftArr = left.toCharArray();
        char[] rightArr = right.toCharArray();
        
        Arrays.sort(leftArr);
        Arrays.sort(rightArr);
        
        return Arrays.equals(leftArr, rightArr) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String input1 = "gaga";
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + isLapindrome(input1));

        String input2 = "rotor";
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + isLapindrome(input2));
    }
}

/*
INPUT & OUTPUT:

Input 1: gaga
Output 1: YES

Input 2: rotor
Output 2: YES
*/
