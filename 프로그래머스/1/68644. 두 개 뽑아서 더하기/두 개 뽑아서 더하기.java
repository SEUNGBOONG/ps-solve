import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(!temp.contains(sum))
                    temp.add(sum);
            }
        }
        Collections.sort(temp);
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}