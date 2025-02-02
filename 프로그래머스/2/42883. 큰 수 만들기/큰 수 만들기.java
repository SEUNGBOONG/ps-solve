class Solution {
public String solution(String number, int k) {
        String answer = "";

        StringBuilder builder = new StringBuilder();

        int idx = 0;
        int max;
        for(int i = 0; i < number.length()-k; i++){
            // i =0 이고 j 도 0인상태
            max = 0;
            for(int j = idx; j <= i+k; j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            builder.append(max);
        }
        return builder.toString();
    }
}