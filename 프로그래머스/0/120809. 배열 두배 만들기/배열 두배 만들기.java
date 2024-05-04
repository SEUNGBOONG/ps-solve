class Solution {
    public int[] solution(int[] numbers) {
        int i;
        int[] answer=new int[numbers.length];
        for(i=0;i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}