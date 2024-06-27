class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = n; i > 0; ) {
                answer += (i * i);
                i -= 2;
            }
        } else {
            for (int i = n; i > 0;) {
                answer += i;
                i -= 2;
            }
        }

        return answer;
    }
}