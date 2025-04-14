class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] ary = new int[number + 1]; // 인덱스 1부터 사용할 것

        for (int i = 1; i <= number; i++) {
            int cnt = count(i);
            if (cnt > limit) {
                ary[i] = power;
            } else {
                ary[i] = cnt;
            }
            answer += ary[i];
        }

        return answer;
    }

    public int count(int num) {
        int count1 = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count1 += 2; // i, num/i 두 개의 약수
                if (i * i == num) count1--; // 제곱수일 경우 중복 제거
            }
        }
        return count1;
    }
}
