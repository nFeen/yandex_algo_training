import java.util.Scanner;

public class task_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = new String[3];
        String now;
        String new_number = toNumber(scanner.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            now = scanner.nextLine();
            numbers[i] = toNumber(now);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(new_number.equals(numbers[i]) ? "YES" : "NO");
        }
        scanner.close();
    }

    public static String toNumber(String line) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                number.append(line.charAt(i));
            }
        }
        if (number.length() == 7)
            number.insert(0, "495");
        else if (number.length() == 11)
            number.deleteCharAt(0);
        return number.toString();
    }
}