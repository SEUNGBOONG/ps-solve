

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // n 읽기

        int[] num1 = new int[n];
        Integer[] num2 = new Integer[n];  // Integer 배열 사용!

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num1);  // num1 오름차순 정렬
        Arrays.sort(num2, Collections.reverseOrder());  // num2 내림차순 정렬

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += num1[i] * num2[i];
        }

        System.out.println(result);
    }
}
