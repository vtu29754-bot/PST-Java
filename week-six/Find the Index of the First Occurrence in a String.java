public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad", needle1 = "sad";
        System.out.println("Input 1: haystack = \"" + haystack1 + "\", needle = \"" + needle1 + "\"");
        System.out.println("Output 1: " + strStr(haystack1, needle1));

        String haystack2 = "leetcode", needle2 = "leeto";
        System.out.println("Input 2: haystack = \"" + haystack2 + "\", needle = \"" + needle2 + "\"");
        System.out.println("Output 2: " + strStr(haystack2, needle2));
    }
}

/*
INPUT & OUTPUT:

Input 1: haystack = "sadbutsad", needle = "sad"
Output 1: 0

Input 2: haystack = "leetcode", needle = "leeto"
Output 2: -1
*/
