import java.util.Scanner;

public class task_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt(), m = scanner.nextInt(), k2 = scanner.nextInt();
        int p2 = scanner.nextInt(), n2 = scanner.nextInt();
        System.out.println(result(k1, m, k2, p2, n2));
        scanner.close();
    }

    public static int[] getEntranceAndFloor(int flatNo, int flatsOnFloor, int floors) {
        int floorsBefore = (flatNo - 1) / flatsOnFloor;
        int entrance = floorsBefore / floors + 1;
        int floor = floorsBefore % floors + 1;
        return new int[] {entrance, floor};
    }

    public static int[] check(int k1, int m, int k2, int p2, int n2, int flatsOnFloor) {
        int entrance2 = getEntranceAndFloor(k2, flatsOnFloor, m)[0];
        int floor2 = getEntranceAndFloor(k2, flatsOnFloor, m)[1];
        if (entrance2 == p2 && floor2 == n2) {
            return getEntranceAndFloor(k1, flatsOnFloor, m);
        }
        return new int[] {-1, -1};
    }

    public static String result(int k1, int m, int k2, int p2, int n2) {
        int ent = -1;
        int floor = -1;
        boolean goodFlag = false;
        for (int flatsOnFloor = 1; flatsOnFloor < Math.pow(10, 6) + 1; flatsOnFloor++) {
            int nent = check(k1, m, k2, p2, n2, flatsOnFloor)[0];
            int nfloor = check(k1, m, k2, p2, n2, flatsOnFloor)[1];
            if (nent != -1) {
                goodFlag = true;
                if (ent == -1) {
                    ent = nent;
                    floor = nfloor;
                } else if (ent != nent && ent != 0) {
                    ent = 0;
                } else if (floor != nfloor && floor != 0) {
                    floor = 0;
                }
            }
        }
        int[] result = new int[2];
        if (goodFlag) {
            result[0] = ent;
            result[1] = floor;
        } else {
            result[0] = -1;
            result[1] = -1;
        }
        return String.valueOf(result[0]) + " " + String.valueOf(result[1]);
    }
}