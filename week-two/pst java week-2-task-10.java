import java.util.*;

class PST_Java_Week2_Task10 {
    public static void main(String[] args) {
        String[] pairLeft = {"john", "john", "john", "mary", "mary"};
        String[] pairRight = {"tom", "mary", "tom", "anna", "anna"};

        System.out.println("Input Pairs:");
        for (int i = 0; i < pairLeft.length; i++) {
            System.out.println(pairLeft[i] + " " + pairRight[i]);
        }

        System.out.println("\nOutput:");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pairLeft.length; i++) {
            set.add(pairLeft[i] + " " + pairRight[i]);
            System.out.println(set.size());
        }
    }
}

/*
INPUT & OUTPUT:

Input Pairs:
john tom
john mary
john tom
mary anna
mary anna

Output:
1
2
2
3
3
*/
