import java.util.Arrays;

class Solution {
public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복 있는애가 도둑맞은 경우
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        //자기번호 +1, -1인 번호에게만 대여가능
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length;j++) {
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }}