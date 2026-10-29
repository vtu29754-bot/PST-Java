import java.util.Arrays;
import java.util.List;

class PST_Java_Week11_Task9 {
    public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[6];
        for (int bird : arr) {
            count[bird]++;
        }
        int maxFreq = 0;
        int mostFrequentBird = 1;
        for (int type = 1; type <= 5; type++) {
            if (count[type] > maxFreq) {
                maxFreq = count[type];
                mostFrequentBird = type;
            }
        }
        return mostFrequentBird;
    }

    public static void main(String[] args) {
        List<Integer> birds = Arrays.asList(1, 4, 4, 4, 5, 3);
        System.out.println("Bird Sightings: " + birds);
        System.out.println("Most Frequent Bird ID: " + migratoryBirds(birds));
    }
}

/*
INPUT & OUTPUT:

INPUT:
[1, 4, 4, 4, 5, 3]

OUTPUT:
Bird Sightings: [1, 4, 4, 4, 5, 3]
Most Frequent Bird ID: 4
*/
