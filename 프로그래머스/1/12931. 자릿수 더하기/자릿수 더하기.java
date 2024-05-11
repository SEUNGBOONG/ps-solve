import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str=Integer.toString(n);
        int[] digit= new int[str.length()];
        for(int i=0; i<str.length(); i++){
            digit[i]=str.charAt(i)-'0';
            answer+=digit[i];
        }
        

        return answer;
    }
}