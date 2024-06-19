
import java.util.ArrayList;
import java.util.List;

class Solution {
public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> list = new ArrayList<>();
        int[] num = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            if (one[i % 5] == answers[i]) {
                num[0]++;
            }
            if (two[i % 8] == answers[i]) {
                num[1]++;
            }
            if (three[i % 10] == answers[i]) {
                num[2]++;
            }
        }
        int max = Math.max(num[0], Math.max(num[1], num[2]));

        for (int i = 0; i < num.length; i++) {
            if (max == num[i]) list.add(i + 1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}