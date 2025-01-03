

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Main a = new Main();
        System.out.println(a.solution(number));
    }

    public int solution(int number) {
        for (int i = 1; i < number; i++) { // 1부터 number - 1까지 검사
            int sum = i;
            int temp = i;

            // 각 자릿수 더하기
            while (temp > 0) {
                sum += temp % 10; // 마지막 자릿수 더하기
                temp /= 10;       // 마지막 자릿수 제거
            }

            // 분해합이 주어진 숫자와 같은 경우
            if (sum == number) {
                return i;
            }
        }

        // 생성자가 없는 경우
        return 0;
    }
}
