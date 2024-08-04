import java.util.Arrays;

class Solution {
    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        // 두 수를 합친 값이 큰 순서대로 (내림차순)
        // o1 : 10, o2 : 2 이면 102과 210 중 뭐가 더 큰지 비교
        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 첫 번째 수가 0이면 0으로만 이뤄진 배열이므로 0을 리턴.
        if (str[0].equals("0")) {
            return "0";
        }

        return String.join("", str);
    }
}