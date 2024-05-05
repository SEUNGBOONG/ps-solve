import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);
        
        // 중앙값을 저장할 변수
        int median;
        
        // 배열의 길이가 홀수인 경우
        if (array.length % 2 == 1) {
            median = array[array.length / 2]; // 중앙값은 중간 위치의 요소
        } 
        // 배열의 길이가 짝수인 경우
        else {
            int middleIndex = array.length / 2;
            median = (array[middleIndex - 1] + array[middleIndex]) / 2; // 중앙 두 값의 평균
        }
        
        return median;
    }
}
