import java.util.Scanner;

public class task_h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_interval = scanner.nextInt();
        int second_interval = scanner.nextInt();
        int first_trains_amount = scanner.nextInt();
        int second_trains_amount = scanner.nextInt();

        int first_min = first_interval * (first_trains_amount - 1) + first_trains_amount;
        int first_max = first_min + 2 * first_interval;

        int second_min = second_interval * (second_trains_amount - 1) + second_trains_amount;
        int second_max = second_min + 2 * second_interval;

        if (first_max < second_min || second_max < first_min) {
            System.out.println(-1);
        } else {
            System.out.printf("%d %d\n", Math.max(first_min, second_min), Math.min(first_max, second_max));
        }

        scanner.close();
    }
}
