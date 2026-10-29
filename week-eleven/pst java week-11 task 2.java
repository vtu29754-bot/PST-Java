class PST_Java_Week11_Task2 {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Input 1: " + s1 + " -> Output: " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Input 2: " + s2 + " -> Output: " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Input 3: " + s3 + " -> Output: " + firstUniqChar(s3));
    }
}

/*
INPUT & OUTPUT:

INPUT:
s1 = "leetcode"
s2 = "loveleetcode"
s3 = "aabb"

OUTPUT:
Input 1: leetcode -> Output: 0
Input 2: loveleetcode -> Output: 2
Input 3: aabb -> Output: -1
*/
