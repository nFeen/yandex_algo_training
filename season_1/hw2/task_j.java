import java.util.Scanner;
import java.util.Objects;

public class task_j {
    public static void main(String[] args) {
        double left = 30;
        double right = 4000;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double prev = scanner.nextDouble();
        String[] line;
        double now;
        String word;
        scanner.nextLine();
        for (int i = 0; i < n - 1; i++) {
            line = scanner.nextLine().split(" ");
            now = Double.parseDouble(line[0]);
            word = line[1];
            if (Objects.equals(word, "closer")) {
                if (now > prev) {
                    left = Math.max(left, (now + prev) / 2);
                } else {
                    right = Math.min(right, (now + prev) / 2);
                }
            } else {
                if (now > prev) {
                    right = Math.min(right, (now + prev) / 2);
                } else {
                    left = Math.max(left, (now + prev) / 2);
                }
            }
            prev = now;
        }
        System.out.printf("%f %f\n", left, right);
        
        scanner.close();
    }
}
