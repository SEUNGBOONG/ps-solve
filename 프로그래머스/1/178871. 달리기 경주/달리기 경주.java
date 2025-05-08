import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        String[] playerList = Arrays.copyOf(players, players.length);

        // 선수 이름 -> 인덱스(등수) 매핑
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        // 호출된 선수 처리
        for (String called : callings) {
            int curIndex = rankMap.get(called); // 현재 인덱스
            int frontIndex = curIndex - 1;

            if (frontIndex >= 0) {
                String frontPlayer = playerList[frontIndex];

                // 배열에서 자리 바꾸기
                playerList[frontIndex] = called;
                playerList[curIndex] = frontPlayer;

                // map에서 순위 업데이트
                rankMap.put(called, frontIndex);
                rankMap.put(frontPlayer, curIndex);
            }
        }

        return playerList;
    }
}
