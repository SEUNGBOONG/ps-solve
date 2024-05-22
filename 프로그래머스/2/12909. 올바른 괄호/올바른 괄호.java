    import java.util.Stack;

class Solution {
    

        public boolean solution(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
    }
}