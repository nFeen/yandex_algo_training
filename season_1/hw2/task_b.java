import java.util.Scanner;

public class task_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean constant = true;
        boolean ascending = true;
        boolean weakly_ascending = true;
        boolean descending = true;
        boolean weakly_descending = true;
        
        int num = scanner.nextInt();
        int prev = num;
        num = scanner.nextInt();
        while (prev != -2000000000 && num != -2000000000) {
            if (num != prev) constant = false;
            if (num < prev) {
                ascending = false;
                weakly_ascending = false;
            }
            if (num > prev) {
                descending = false;
                weakly_descending = false;
            }
            if (ascending && num == prev) {
                ascending = false;
                weakly_ascending = true;
            } 
            if (descending && num == prev) {
                descending = false;
                weakly_descending = true;
            }
            prev = num;
            num = scanner.nextInt();
        }

        if (constant) System.out.println("CONSTANT");
        else if (ascending) System.out.println("ASCENDING");
        else if (descending) System.out.println("DESCENDING");
        else if (weakly_ascending) System.out.println("WEAKLY ASCENDING");
        else if (weakly_descending) System.out.println("WEAKLY DESCENDING");
        else System.out.println("RANDOM");
        
        scanner.close();
    }
}
