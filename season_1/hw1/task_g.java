import java.util.Scanner;

public class task_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        
        int blanks;
        int blanks_mod;
        int count_parts = 0;
        while (k >= m && n >= k) {
            blanks = n / k;
            count_parts += k / m * blanks;
            blanks_mod = blanks * k - k / m * blanks * m;
            n = n % k + blanks_mod;
        }
        System.out.println(count_parts);

        scanner.close();
    }
}
