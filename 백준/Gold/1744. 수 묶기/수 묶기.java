

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder()); // 큰 값부터 처리
        PriorityQueue<Integer> negative = new PriorityQueue<>(); // 작은 값부터 처리

        int ones = 0;  // 1의 개수
        int zeroes = 0; // 0의 개수

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num > 1) {
                positive.add(num);
            } else if (num == 1) {
                ones++; // 1은 더하는 것이 유리하므로 따로 카운트
            } else if (num == 0) {
                zeroes++;
            } else {
                negative.add(num);
            }
        }

        int result = 0;

        // 양수 처리 (큰 수부터 두 개씩 묶어 곱하기)
        while (positive.size() > 1) {
            int a = positive.poll();
            int b = positive.poll();
            result += a * b;
        }
        if (!positive.isEmpty()) {
            result += positive.poll(); // 홀수 개라면 남은 숫자 더하기
        }

        // 음수 처리 (작은 수부터 두 개씩 묶어 곱하기)
        while (negative.size() > 1) {
            int a = negative.poll();
            int b = negative.poll();
            result += a * b;
        }
        if (!negative.isEmpty()) {
            // 남은 음수가 있고 0이 없으면 그냥 더함
            if (zeroes == 0) {
                result += negative.poll();
            }
        }

        // 1은 무조건 더하기
        result += ones;

        System.out.println(result);
    }
}
