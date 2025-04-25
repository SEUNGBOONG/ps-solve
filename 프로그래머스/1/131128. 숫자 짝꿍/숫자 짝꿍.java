import java.util.*;

public class Solution {
    public String solution(String x, String y) {
        List<String> list = new ArrayList<>(List.of(x.split("")));
        List<String> list2 = new ArrayList<>(List.of(y.split("")));
        List<String> num = new ArrayList<>();

        // 각 숫자 0~9에 대해 몇 번 나오는지 세기
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            int count1 = Collections.frequency(list, s);
            int count2 = Collections.frequency(list2, s);
            int minCount = Math.min(count1, count2);

            for (int j = 0; j < minCount; j++) {
                num.add(s);
            }
        }

        if (num.isEmpty()) {
            return "-1";
        }

        // 내림차순 정렬
        num.sort(Comparator.reverseOrder());

        // 0만 있으면 "0" 리턴
        if (num.get(0).equals("0")) {
            return "0";
        }

        // 문자열로 합치기
        StringBuilder sb = new StringBuilder();
        for (String s : num) {
            sb.append(s);
        }

        return sb.toString();
    }
}
