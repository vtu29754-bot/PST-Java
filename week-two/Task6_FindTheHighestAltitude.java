import java.util.Arrays;

public class Task6_FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        return Arrays.stream(gain)
                     .reduce(new int[]{0, 0}, (acc, g) -> {
                         int currentAltitude = acc[1] + g;
                         int maxAltitude = Math.max(acc[0], currentAltitude);
                         return new int[]{maxAltitude, currentAltitude};
                     }, (a, b) -> a)[0];
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
