package Assignment_07;

import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Path(0, n, "", m);
        System.out.println();
        System.out.println(CountPath(0, n, "", m));
    }

    public static void Path(int curr, int n, String ans, int m) {
        if (curr == n) {
            System.out.print(ans + " ");
            return;
        }
        if (curr > n) {
            return;
        }
        for (int dice = 1; dice <= m; dice++) {
            Path(curr + dice, n, ans + dice, m);
        }
    }

    public static int CountPath(int curr, int n, String ans, int m) {
        if (curr == n) {
            return 1;
        }
        if (curr > n) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= m; dice++) {
            count += CountPath(curr + dice, n, ans + dice, m);
        }
        return count;
    }
}
