import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 키패드 좌표 설정
        int[][] keypad = {
            {3, 1}, // 0
            {0, 0}, {0, 1}, {0, 2}, // 1,2,3
            {1, 0}, {1, 1}, {1, 2}, // 4,5,6
            {2, 0}, {2, 1}, {2, 2}  // 7,8,9
        };
        
        int[] left = {3,0};
        int[] right = {3,2};
        for(int num : numbers){
            if(num==1 || num == 4 || num ==7){
                answer+="L";
                left=keypad[num];
            }
            else if(num == 3 || num == 6 || num ==9){
                answer+="R";
                right=keypad[num];
            }else{
                int[] target = keypad[num];
                int leftDist = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int rightDist = Math.abs(right[0] - target[0])+Math.abs(right[1] - target[1]);
                if(leftDist>rightDist){
                    answer+="R";
                    right=target;
                }
                else if (leftDist < rightDist){
                    answer+="L";
                    left=target;
                }
                else{
                    if(hand.equals("right")){
                        answer+="R";
                        right =target;
                    }
                    else{
                        answer+="L";
                        left=target;
                    }
                }
            }
        }
        return answer;
    }
}