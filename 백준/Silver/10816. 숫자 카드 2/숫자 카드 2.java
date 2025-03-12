

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 카드 개수 입력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cardCount = new HashMap<>();

        // 2. 카드 개수 카운팅
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        // 3. 찾고 싶은 카드 개수 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 4. 결과 출력
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(cardCount.getOrDefault(num, 0)).append(" ");
        }
        System.out.println(sb);
    }
}
