import java.util.Scanner;
import java.util.Arrays;

public class task_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        if (array.length > 2) {
            int max1_pos = Math.max(array[0], array[1]);
            int max2_pos = Math.min(array[0], array[1]);
            for (int i = 2; i < array.length; i++) {
                if (array[i] > max1_pos) {
                    max2_pos = max1_pos;
                    max1_pos = array[i];
                } else if (array[i] > max2_pos) {
                    max2_pos = array[i];
                }
            }
            int max1_neg = 0;
            int max2_neg = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < max1_neg) {
                    max2_neg = max1_neg;
                    max1_neg = array[i];
                } else if (array[i] < max2_neg) {
                    max2_neg = array[i];
                }
            }
            boolean pos_greater = ((long)max1_pos * max2_pos) > (max1_neg * (long)max2_neg);
            System.out.printf("%d %d\n", pos_greater ? max2_pos : max1_neg, pos_greater ? max1_pos : max2_neg);
        } else {
            System.out.printf("%d %d\n", Math.min(array[0], array[1]), Math.max(array[0], array[1]));
        }
        scanner.close();
    }
}
