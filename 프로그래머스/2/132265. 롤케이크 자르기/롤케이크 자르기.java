public class Solution {
    public int solution(int[] topping) {
        int max = 10001; // 토핑 번호는 1~10000이라고 가정
        int[] left = new int[max];
        int[] right = new int[max];
        int leftKinds = 0, rightKinds = 0;
        int answer = 0;

        // 먼저 오른쪽 배열에 모든 토핑 카운팅
        for (int t : topping) {
            if (right[t] == 0) rightKinds++;
            right[t]++;
        }

        // 하나씩 왼쪽으로 이동시키며 종류 수 비교
        for (int t : topping) {
            if (left[t] == 0) leftKinds++;
            left[t]++;
            
            right[t]--;
            if (right[t] == 0) rightKinds--;

            if (leftKinds == rightKinds) answer++;
        }

        return answer;
    }
}