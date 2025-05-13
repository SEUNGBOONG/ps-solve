import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) {
                answer++;
            }
        }

        return answer;
    }

    // 올바른 괄호인지 확인하는 메서드
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
