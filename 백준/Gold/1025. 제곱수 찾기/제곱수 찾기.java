import java.util.Scanner;

public class Main {
    static int N, M;
    static char[][] map;
    static int max = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // 개행 제거
        map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                for (int dx = -N; dx <= N; dx++) {
                    for (int dy = -M; dy <= M; dy++) {
                        if (dx == 0 && dy == 0) continue;

                        int cx = x;
                        int cy = y;
                        StringBuilder sb = new StringBuilder();

                        while (cx >= 0 && cx < N && cy >= 0 && cy < M) {
                            sb.append(map[cx][cy]);
                            int num = Integer.parseInt(sb.toString());

                            if (isPerfectSquare(num)) {
                                max = Math.max(max, num);
                            }

                            cx += dx;
                            cy += dy;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }

    static boolean isPerfectSquare(int num) {
        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
