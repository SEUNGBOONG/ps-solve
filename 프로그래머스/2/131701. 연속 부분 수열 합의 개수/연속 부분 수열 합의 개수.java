import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int n = elements.length;

        // 길이 1부터 n까지 반복
        for (int len = 1; len <= n; len++) {
            // 시작 위치 0부터 n-1까지
            for (int start = 0; start < n; start++) {
                int sum = 0;
                // 연속된 len개의 값을 더함 (원형 배열이므로 % 사용)
                for (int i = 0; i < len; i++) {
                    sum += elements[(start + i) % n];
                }
                sumSet.add(sum); // 중복 없이 저장
            }
        }

        return sumSet.size(); // 서로 다른 합의 개수
    }
}
