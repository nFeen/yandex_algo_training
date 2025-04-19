import java.util.Scanner;

public class task_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();

        int min = Math.abs(x - array[0]);
        int ans = array[0];
        for (int i = 1; i < n; i++) {
            if (Math.abs(x - array[i]) < min) {
                min = Math.abs(x - array[i]);
                ans = array[i];
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
