class Solution {
 public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += " ";
                idx = 0;
                continue;
            }
            if ((idx % 2) == 0) {
                answer += String.valueOf(Character.toUpperCase(c));
                idx++;
            } else {
                answer += String.valueOf(Character.toLowerCase(c));
                idx++;
            }
        }
        return answer;
 }
}