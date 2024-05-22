import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 1 1 3 2 2 2 1
        // 1 3 2 1
        //자료구조를 모르면 이렇게 풀어야한다.


        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int beforeNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int nowNumber = arr[i];

            if (nowNumber == beforeNumber) {
                continue;
            } else {
                answer.add(nowNumber);
                beforeNumber = nowNumber;
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}