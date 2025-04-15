import java.util.Scanner;

public class task_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result;
        if (c < 0 || (a == 0 && b != c * c) || (a != 0 && (c * c - b) % a != 0)) System.out.println("NO SOLUTION");
        else if (a == 0 && b == c * c) System.out.println("MANY SOLUTIONS");
        else {
            result = (c * c - b) / a;
            System.out.println(result);
        }
        scanner.close();
    }
}
