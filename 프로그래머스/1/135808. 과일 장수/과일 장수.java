import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
  public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int s : score){
            list.add(s);
        }
        Collections.sort(list);
        for(int i = score.length -m; i >= 0; i-=m){
            answer += m*(list.get(i));
        }
        return answer;
    }

}