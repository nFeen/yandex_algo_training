import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class task_f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = IntStream.range(0, n)
                               .map(i -> scanner.nextInt())
                               .toArray();
        LinkedList<Integer> ans = new LinkedList<Integer>();
        for (int start = 0; start < n; start++) {
            if (isSymmetric(array, start, n - 1)) {
                for (int i = start - 1; i >= 0; i--) {
                    ans.add(array[i]);
                }
                break;
            }
        }
        System.out.println(ans.size());
        System.out.println(ans.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(" ")));
        scanner.close();
    }
    public static boolean isSymmetric(int[] seq, int i, int j) {
        while (i <= j && seq[i] == seq[j]) {
            i++;
            j--;
        }
        if (i > j) {
            return true;
        }
        return false;
    }
}
