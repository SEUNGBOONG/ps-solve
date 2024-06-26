class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
        }
        int same = 0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (win_nums[i] == lottos[j]) {
                    same++;
                }
            }
        }
        int[] answer = new int[2];
        if (zero == 6) {
            answer[0] = 1;
            answer[1] = 6;
        } else if (same + zero < 2) {
            answer[0] = 6;
            answer[1] = 6;
        } else {
            answer[0] = 7 - same - zero;
            answer[1] = 7 - same;
        }
        return answer;
    }

}