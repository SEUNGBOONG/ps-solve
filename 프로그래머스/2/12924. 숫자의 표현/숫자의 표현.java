class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            while (sum > n) {
                sum -= start;
                start++;
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;
    }
}