import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class task_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        array[0] = scanner.nextInt();
        int max = array[0];
        int winner_index = 0;
        for (int i = 1; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                winner_index = i;
            }
        }

        int vasya = 0;
        for (int i = winner_index + 1; i < n - 1; i++) {
            if (array[i] % 10 == 5 && array[i + 1] < array[i] && array[i] > vasya) {
                vasya = array[i];
            }
        }

        Integer[] sortedArray = Arrays.stream(array)
                                     .boxed()
                                     .toArray(Integer[]::new);
        Arrays.sort(sortedArray, Collections.reverseOrder());

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (sortedArray[i] == vasya) {
                ans = i + 1;
                break;
            }
        }

        System.out.println(ans);

        scanner.close();
    }
}
