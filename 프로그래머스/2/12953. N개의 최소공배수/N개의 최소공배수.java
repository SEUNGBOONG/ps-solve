class Solution {
    // 최대공약수 (유클리드 호제법)
    public int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    // 최소공배수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }
}
