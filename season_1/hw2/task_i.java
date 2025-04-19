import java.util.Scanner;
import java.util.Arrays;

public class task_i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        int mines_amount = scanner.nextInt();
        int[][] mines = new int[mines_amount][2];
        for (int i = 0; i < mines_amount; i++) {
            mines[i][0] = scanner.nextInt() - 1;
            mines[i][1] = scanner.nextInt() - 1;
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(count_mines(i, j, mines, lines, columns));
                if (j != columns - 1) System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
    public static char count_mines(int line, int column, int[][] mines, int lines, int columns) {
        if (!is_mine(line, column, mines)) {
            int[] shift_i = {1, 1, 1, 0, 0, -1, -1, -1};
            int[] shift_j = {-1, 0, 1, -1, 1, -1, 0, 1};
            int count = 0;
            for (int i = 0; i < 8; i++) {
                int[] neighbour = get_neighbour(line, column, shift_i[i], shift_j[i], lines, columns);
                if (is_mine(neighbour[0], neighbour[1], mines)) {
                    count++;
                }
            }
            return (char)(count + '0');
        } else {
            return '*';
        }
    }
    public static int[] get_neighbour(int line, int column, int shift_i, int shift_j, int lines, int columns) {
        if (line + shift_i > lines - 1 || line + shift_i < 0 || column + shift_j > columns - 1 || column + shift_j < 0) {
            return new int[] {-1, -1};
        }
        return new int[] {line + shift_i, column + shift_j};
    }
    public static boolean is_mine(int line, int column, int[][] mines) {
        if (line != -1 && column != -1) {
            for (int i = 0; i < mines.length; i++) {
                if (Arrays.equals(new int[] {line, column}, mines[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
