import java.util.Scanner;

public class Main {
    static int[][] dp = new int[31][31]; // 최대 30C30까지

    public static int comb(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r];  // 이미 계산된 값
        if (n == r || r == 0) return dp[n][r] = 1;
        return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(comb(M, N));  // M C N
        }
    }
}
