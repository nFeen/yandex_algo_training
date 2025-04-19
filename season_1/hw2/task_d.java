import java.util.Scanner;
import java.util.Arrays;

public class task_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] array = Arrays.stream(line.split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1])
                count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
