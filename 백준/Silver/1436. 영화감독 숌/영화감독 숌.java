

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Main a = new Main();
        System.out.println(a.result(number));
    }

    public int result(int number) {
        int count = 0;
        int title = 666;

        // N번째로 작은 666이 포함된 숫자를 찾을 때까지 반복
        while (true) {
            if (String.valueOf(title).contains("666")) { // "666"이 포함된 숫자인지 확인
                count++; // 조건에 맞으면 count 증가
            }

            if (count == number) { // count가 입력된 번호와 같으면 title 반환
                return title;
            }

            title++; // 다음 숫자로 이동
        }
    }
}
