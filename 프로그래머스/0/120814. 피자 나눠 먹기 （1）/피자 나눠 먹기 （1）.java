class Solution {
   public int solution(int n) {

        int answer;
        int PIZZA_PIECE=7;

        if (n % PIZZA_PIECE == 0) {
            answer = n / PIZZA_PIECE; // 피자 조각의 수가 7의 배수인 경우
        } else {
            answer = n / PIZZA_PIECE + 1; // 피자 조각의 수가 7의 배수가 아닌 경우
        }

        return answer;
    }
}