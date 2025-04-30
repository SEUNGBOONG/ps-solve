class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true; // 단어의 시작인지 확인하는 플래그

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                isStart = true; // 공백 다음 문자는 단어 시작
            } else {
                if (isStart) {
                    answer.append(Character.toUpperCase(c));
                    isStart = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }

        return answer.toString();
    }
}
