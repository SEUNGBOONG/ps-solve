public class Solution {
    public boolean solution(String s) {
        // 대문자로 변환하여 비교하기 위해 모두 소문자로 변경
        s = s.toLowerCase();
        
        // 'p'와 'y'의 개수 카운트
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                countP++;
            } else if (ch == 'y') {
                countY++;
            }
        }
        
        // 'p'와 'y'의 개수 비교
        return countP == countY;
    }
}
