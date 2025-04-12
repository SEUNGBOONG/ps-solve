import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!lastIndexMap.containsKey(ch)) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndexMap.get(ch);
            }
            lastIndexMap.put(ch, i); // 현재 위치를 기록
        }

        return answer;
    }
}
