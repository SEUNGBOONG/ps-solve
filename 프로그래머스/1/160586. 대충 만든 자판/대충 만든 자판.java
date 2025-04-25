import java.util.*;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 각 알파벳의 최소 누르는 횟수를 저장할 Map
        Map<Character, Integer> keyMap = new HashMap<>();

        // keymap 돌면서 최소 횟수 계산
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int pressCount = i + 1; // 위치는 0부터 시작하니 +1

                // 이미 존재하면 더 작은 값으로 갱신
                if (keyMap.containsKey(ch)) {
                    keyMap.put(ch, Math.min(keyMap.get(ch), pressCount));
                } else {
                    keyMap.put(ch, pressCount);
                }
            }
        }

        // 결과 배열
        int[] answer = new int[targets.length];

        // 각 target에 대해 계산
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (char ch : targets[i].toCharArray()) {
                if (keyMap.containsKey(ch)) {
                    sum += keyMap.get(ch);
                } else {
                    sum = -1; // 하나라도 못 누르면 전체 -1
                    break;
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}
