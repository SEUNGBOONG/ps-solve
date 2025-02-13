import java.util.*;
class Solution {
 public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};  // 오른쪽, 왼쪽, 아래, 위
        int[] dy = {0, 0, 1, -1};

        int n = maps.length;
        int m = maps[0].length;

        int[][] dist = new int[n][m];  // 각 칸까지의 거리를 저장
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = -1;  // 아직 방문하지 않은 곳은 -1로 초기화
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});  // 시작점 (0, 0)부터 시작
        dist[0][0] = 1;  // 시작점은 1로 초기화

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 맵 범위 내에 있고, 이동할 수 있는 칸이라면
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[x][y] + 1;  // 현재 칸에서 한 칸 이동
                    queue.add(new int[]{nx, ny});

                    // 목표 지점에 도달하면 바로 리턴
                    if (nx == n - 1 && ny == m - 1) {
                        return dist[nx][ny];
                    }
                }
            }
        }

        // 목표지점에 도달할 수 없다면 -1 반환
        return -1;
    }
}