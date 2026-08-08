import java.util.Arrays;

class PST_Java_Week2_Task6 {
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Input 1: gain = " + Arrays.toString(gain1));
        System.out.println("Output 1: " + largestAltitude(gain1));

        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Input 2: gain = " + Arrays.toString(gain2));
        System.out.println("Output 2: " + largestAltitude(gain2));
    }
}

/*
INPUT & OUTPUT:

Input 1: gain = [-5, 1, 5, 0, -7]
Output 1: 1

Input 2: gain = [-4, -3, -2, -1, 4, 3, 2]
Output 2: 0
*/
