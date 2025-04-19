import java.util.Scanner;
import java.util.Arrays;

public class task_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String line = scanner.nextLine();
        int[] list = Arrays.stream(line.split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
        int now = list[0];
        for (int i = 1; i < list.length && flag; i++) {
            if (now >= list[i]) {
                flag = false;
            }
            now = list[i];
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
