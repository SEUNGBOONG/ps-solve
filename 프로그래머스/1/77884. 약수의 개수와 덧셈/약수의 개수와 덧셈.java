import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int left, int right) {

        int answer = 0;
        
        for (int num = left; num <= right; num++) {
            int divisorCount = 0;
            
            // Calculate the number of divisors
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisorCount++;
                }
            }
            
            // Check if the number of divisors is even or odd
            if (divisorCount % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        return answer;
    }

}