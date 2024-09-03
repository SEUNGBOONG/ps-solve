class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = (n < m)? n : m;
        int gcd = 0;

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0)
                gcd = i;
        }

        answer[0] = gcd;

        answer[1] = n * m / gcd;
        return answer;}
}