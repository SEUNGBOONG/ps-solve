class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i;
        if (a <= b) {
            for (i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

}