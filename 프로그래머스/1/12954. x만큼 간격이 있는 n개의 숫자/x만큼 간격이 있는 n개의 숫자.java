class Solution {
    public long[] solution(int x, int n) {
        int i;
        long[] answer = new long[n];
        for(i=1;i<=n;i++){
            answer[i-1]+=((long) x *i);
        }
        return answer;
    }

}