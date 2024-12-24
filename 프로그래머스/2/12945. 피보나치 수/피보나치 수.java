import java.util.ArrayList;
import java.util.List;
class Solution {
     public int solution(int n) {
        int MOD = 1234567;

        int prev2 = 0;
        int prev1 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = (prev1 + prev2) % MOD;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}