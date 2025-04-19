import java.util.Scanner;
import java.util.Arrays;

public class task_h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int max1_pos = Math.max(Math.max(array[0], array[1]), array[2]);
        int max3_pos = Math.min(Math.min(array[0], array[1]), array[2]);
        int max2_pos = array[0] + array[1] + array[2] - max1_pos - max3_pos;
        if (array.length > 3) {
            int max1_neg = 0;
            int max2_neg = 0;
            for (int i = 0; i < array.length; i++) {
                if (max1_pos < array[i]) {
                    max3_pos = max2_pos;
                    max2_pos = max1_pos;
                    max1_pos = array[i];
                } else if (max2_pos < array[i] && i > 2) {
                    max3_pos = max2_pos;
                    max2_pos = array[i];
                } else if (max3_pos < array[i] && i > 2) {
                    max3_pos = array[i];
                }
                if (max1_neg > array[i]) {
                    max2_neg = max1_neg;
                    max1_neg = array[i];
                } else if (max2_neg > array[i]) {
                    max2_neg = array[i];
                }
            }
            boolean pos_greater = (long)max1_pos * max2_pos * max3_pos > (long)max1_neg * max2_neg * max1_pos;
            System.out.printf("%d %d %d\n", pos_greater ? max3_pos : max1_neg, pos_greater ? max2_pos : max2_neg, max1_pos);
        } else {
            System.out.printf("%d %d %d\n", max3_pos, max2_pos, max1_pos);
        }
        scanner.close();
    }
}
