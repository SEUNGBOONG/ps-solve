import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력: n 값
        int n = Integer.parseInt(br.readLine());

        // 두 번째 입력: 숫자들
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        // 최소값 찾기
        int value = Collections.min(numbers);

        // 공약수 찾기
        for (int i = 1; i <= value; i++) {
            boolean isCommonDivisor = true;
            for (int num : numbers) {
                if (num % i != 0) {
                    isCommonDivisor = false;
                    break;
                }
            }
            if (isCommonDivisor) {
                System.out.println(i);
            }
        }
    }
}
