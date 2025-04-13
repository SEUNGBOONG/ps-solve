import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int rollerEnd = 0;  // 마지막으로 칠한 구역의 끝 위치

        for (int pos : section) {
            if (pos > rollerEnd) {
                // 현재 위치가 아직 칠해지지 않았다면, 여기서 롤러 시작
                rollerEnd = pos + m - 1;
                answer++;
            }
        }

        return answer;
    }
}
