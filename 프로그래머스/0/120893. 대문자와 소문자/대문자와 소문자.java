class Solution {
    public String solution(String my_string) {
        // 주어진 문자열을 문자 배열로 변환
        char[] chars = my_string.toCharArray();

        // 각 문자의 대소문자를 변환
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) { // 대문자인 경우
                chars[i] = Character.toLowerCase(chars[i]); // 대문자를 소문자로 변환
            } else if (Character.isLowerCase(chars[i])) { // 소문자인 경우
                chars[i] = Character.toUpperCase(chars[i]); // 소문자를 대문자로 변환
            }
            // 그 외의 경우 (예: 공백, 숫자 등)는 변환하지 않음
        }

        // 변환된 문자 배열을 문자열로 결합하여 반환
        return new String(chars);
    }
}