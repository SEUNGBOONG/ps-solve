

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 카드 개수, M: 합치는 횟수
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 최소 힙 (작은 값이 우선순위 높음)
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // 카드 값 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        // 카드 합체 과정
        for (int i = 0; i < m; i++) {
            long num1 = pq.poll();  // 가장 작은 값
            long num2 = pq.poll();  // 두 번째로 작은 값
            long result = num1 + num2;
            pq.add(result);
            pq.add(result);  // 합친 결과 두 장 추가
        }

        // 모든 카드 합 구하기
        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        // 결과 출력
        System.out.println(sum);
    }
}
