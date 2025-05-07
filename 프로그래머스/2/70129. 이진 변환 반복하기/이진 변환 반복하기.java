import java.util.*;

class Solution {


    public int[] solution(String s) {
        int convertCount = 0; // 변환 횟수
        int removedZeroCount = 0; // 제거한 0의 총 개수

        while (!s.equals("1")) {
            int originalLength = s.length();

            // 0 제거
            s = s.replaceAll("0", "");
            int newLength = s.length();

            // 제거된 0 개수 누적
            removedZeroCount += (originalLength - newLength);

            // 이진수 변환
            s = Integer.toBinaryString(newLength);
            convertCount++;
        }

        return new int[]{convertCount, removedZeroCount};
    }


}