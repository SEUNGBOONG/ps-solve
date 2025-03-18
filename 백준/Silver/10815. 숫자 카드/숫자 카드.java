

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. N (기준 숫자 카드 개수)
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        // 2. N개의 숫자 저장 (기준 카드)
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            map.put(Integer.parseInt(st.nextToken()), 0);
        }

        // 3. M (확인할 숫자 개수)
        int m = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();

        // 4. M개의 숫자 확인 및 결과 저장
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            // 기준 카드에 있는지 확인하고 결과에 추가 (1: 있음, 0: 없음)
            result.add(map.containsKey(number) ? 1 : 0);
        }

        // 5. 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            sb.append(r).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
