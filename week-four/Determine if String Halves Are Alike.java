public class DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);
        
        int countA = 0, countB = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < a.length(); i++) {
            if (vowels.indexOf(a.charAt(i)) != -1) countA++;
            if (vowels.indexOf(b.charAt(i)) != -1) countB++;
        }
        
        return countA == countB;
    }

    public static void main(String[] args) {
        String input1 = "book";
        boolean output1 = halvesAreAlike(input1);
        System.out.println("Input 1: s = " + input1);
        System.out.println("Output 1: " + output1);

        String input2 = "textbook";
        boolean output2 = halvesAreAlike(input2);
        System.out.println("Input 2: s = " + input2);
        System.out.println("Output 2: " + output2);
    }
}

/*
INPUT & OUTPUT:

Input 1: s = book
Output 1: true

Input 2: s = textbook
Output 2: false
*/
