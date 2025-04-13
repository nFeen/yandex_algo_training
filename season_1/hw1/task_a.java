import java.util.Scanner;

public class task_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int troom = scanner.nextInt();
        int tcond = scanner.nextInt();
        scanner.nextLine();
        String mode = scanner.nextLine();
        String result = String.valueOf(troom);
        if (mode.equals("freeze")) {
            if (troom <= tcond) {
                result = String.valueOf(troom);
            } else {
                result = String.valueOf(tcond);
            }
        }
        if (mode.equals("heat")) {
            if (troom >= tcond) {
                result = String.valueOf(troom);
            } else {
                result = String.valueOf(tcond);
            }
        }
        if (mode.equals("auto")) {
            result = String.valueOf(tcond);
        }
        scanner.close();
        System.out.println(result);
    }
}