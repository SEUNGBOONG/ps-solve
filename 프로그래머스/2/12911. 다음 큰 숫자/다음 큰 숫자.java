import java.util.Collections;
import java.util.List;

class Solution {



    public int solution(int n) {
        int targetCount = Integer.bitCount(n);

        while (true) {
            n++; 
            if (Integer.bitCount(n) == targetCount) {
                return n;
            }
        }
    }

}


