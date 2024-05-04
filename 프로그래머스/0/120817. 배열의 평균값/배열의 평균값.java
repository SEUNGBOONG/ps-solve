class Solution {
    public double solution(int[] numbers) {
        int i;
        double sum=0;
        for(i=0; i<numbers.length; i++){
            sum +=numbers[i];
        }
        double answer = (sum/ numbers.length);
        return answer;
    }
}