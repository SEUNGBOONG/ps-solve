import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 합
        int L = sc.nextInt(); // 최소 길이

        for (int k = L; k <= 100; k++) {
            // 수열의 시작값 계산
            int temp = N - (k * (k - 1)) / 2;

            if (temp < 0) break; // 시작값이 음수면 불가능

            if (temp % k == 0) {
                int x = temp / k;
                for (int i = 0; i < k; i++) {
                    System.out.print((x + i) + " ");
                }
                return;
            }
        }

        System.out.println("-1"); // 수열이 없으면 -1 출력
    }
}