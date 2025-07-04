import java.io.*;
import java.util.*;

public class Main {
    static int[] buildTime, indegree, result;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());  // 테스트케이스 수

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());  // 건물 수
            int K = Integer.parseInt(st.nextToken());  // 규칙 수

            buildTime = new int[N + 1];       // 건물 짓는 시간
            indegree = new int[N + 1];        // 진입 차수
            result = new int[N + 1];          // 최종 건설 시간
            graph = new ArrayList[N + 1];
            for (int i = 0; i <= N; i++) graph[i] = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                buildTime[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                graph[X].add(Y);
                indegree[Y]++;
            }

            int W = Integer.parseInt(br.readLine());  // 목표 건물 번호

            // 위상 정렬 시작
            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                if (indegree[i] == 0) {
                    q.offer(i);
                    result[i] = buildTime[i];
                }
            }

            while (!q.isEmpty()) {
                int now = q.poll();
                for (int next : graph[now]) {
                    result[next] = Math.max(result[next], result[now] + buildTime[next]);
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        q.offer(next);
                    }
                }
            }

            System.out.println(result[W]);
        }
    }
}