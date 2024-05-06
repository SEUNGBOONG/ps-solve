class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (Character.isDigit(currentChar)) {
                int digit = Character.getNumericValue(currentChar);
                answer += digit;
            }
        }
        return answer;
    }
}