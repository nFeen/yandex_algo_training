import java.util.Scanner;

public class java_i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int[] abc = {a, b, c};
        int temp;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (abc[j] > abc[j + 1]) {
                    temp = abc[j];
                    abc[j] = abc[j + 1];
                    abc[j + 1] = temp;
                }
            }
        }
        if (d > e) {
            temp = d;
            d = e;
            e = temp;
        }
        a = abc[0];
        b = abc[1];
        c = abc[2];

        if (a <= d && b <= e) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
