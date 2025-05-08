import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> mbti = new HashMap<>();
        
        for (int i = 0; i < survey.length; i++) {
            String[] value = survey[i].split("");
            if (choices[i] > 4) {
                int num = choices[i] - 4;
                mbti.put(value[1], mbti.getOrDefault(value[1], 0) + num);
            } else if (choices[i] < 4) {
                int num = 4 - choices[i];
                mbti.put(value[0], mbti.getOrDefault(value[0], 0) + num);
            }
            // choices[i] == 4 인 경우는 아무 점수도 안 넣음
        }

        if (mbti.getOrDefault("R", 0) >= mbti.getOrDefault("T", 0)) {
            answer += "R";
        } else {
            answer += "T";
        }

        if (mbti.getOrDefault("C", 0) >= mbti.getOrDefault("F", 0)) {
            answer += "C";
        } else {
            answer += "F";
        }

        if (mbti.getOrDefault("J", 0) >= mbti.getOrDefault("M", 0)) {
            answer += "J";
        } else {
            answer += "M";
        }

        if (mbti.getOrDefault("A", 0) >= mbti.getOrDefault("N", 0)) {
            answer += "A";
        } else {
            answer += "N";
        }

        return answer; // <- 이게 필요합니다!
    }
}
