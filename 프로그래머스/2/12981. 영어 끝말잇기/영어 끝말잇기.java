import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        used.add(words[0]); // 첫 단어 저장

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];

            // 1. 끝말잇기 규칙 어김
            if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }

            // 2. 중복 단어 사용
            if (used.contains(curr)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }

            used.add(curr);
        }

        return new int[]{0, 0}; // 문제 없음
    }
}
