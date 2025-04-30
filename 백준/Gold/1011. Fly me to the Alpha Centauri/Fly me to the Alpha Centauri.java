import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int d = y - x;
            int n = (int) Math.sqrt(d);

            if (d == n * n) {
                System.out.println(2 * n - 1);
            } else if (d <= n * n + n) {
                System.out.println(2 * n);
            } else {
                System.out.println(2 * n + 1);
            }
        }
    }
}
