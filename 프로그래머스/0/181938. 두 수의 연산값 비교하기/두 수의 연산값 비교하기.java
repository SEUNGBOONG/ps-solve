class Solution {
 public int solution(int a, int b) {
        int sum2 = 2 * a * b;
        String sum1 = String.valueOf(a) + String.valueOf(b);
        int sum3 = Integer.parseInt(sum1);
        int answer = Math.max(sum2, sum3);

        return answer;
    }
}