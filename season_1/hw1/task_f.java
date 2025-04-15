import java.util.Scanner;

public class task_f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt(), b1 = scanner.nextInt();
        int a2 = scanner.nextInt(), b2 = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int mul1 = 0;
        int mul2 = 0;
        int[][] first_rect = {{a1, b1}, {b1, a1}};
        int[][] second_rect = {{a2, b2}, {b2, a2}};
        for (int[] l1 : first_rect) {
            for (int[] l2 : second_rect) {
                int width1 = l1[0] + l2[0];
                int height1 = Math.max(l1[1], l2[1]);
                if (width1 * height1 < min) {
                    min = width1 * height1;
                    mul1 = width1;
                    mul2 = height1;
                }
                int width2 = Math.max(l1[0], l2[0]);
                int height2 = l1[1] + l2[1];
                if (width2 * height2 < min) {
                    min = width2 * height2;
                    mul1 = width2;
                    mul2 = height2;
                }
            }
        }
        System.out.printf("%d %d\n", mul1, mul2);
        scanner.close();
    }
}
