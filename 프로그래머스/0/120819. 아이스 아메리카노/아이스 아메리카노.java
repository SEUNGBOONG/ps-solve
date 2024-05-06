class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int iceAmericano = 5500;
        
        if (money >= iceAmericano) {
            answer[0] = money / iceAmericano; // 최대로 구매할 수 있는 아메리카노의 잔 수
            answer[1] = money % iceAmericano; // 남은 돈
        } else {
            answer[0] = 0; // 아메리카노를 구매하지 못함
            answer[1] = money; // 남은 돈
        }
        
        return answer;
    }
}
