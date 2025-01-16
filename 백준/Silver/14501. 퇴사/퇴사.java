import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n + 1];
        int[] coin = new int[n + 1];
        int[] dp = new int[n + 2]; // n+1일까지 계산

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i] = Integer.parseInt(st.nextToken());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        // DP 계산 (역순)
        for (int i = n; i > 0; i--) {
            if (i + array[i] <= n + 1) { // 상담 가능
                dp[i] = Math.max(dp[i + 1], coin[i] + dp[i + array[i]]);
            } else { // 상담 불가능
                dp[i] = dp[i + 1];
            }
        }

        System.out.println(dp[1]); // 1일부터 최대 수익 출력
    }
}
