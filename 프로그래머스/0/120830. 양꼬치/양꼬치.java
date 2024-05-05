class Solution {
   public int solution(int n, int k) {
        int answer = 0;
        int serviceN=n/10;
        int sheep=12000;
        int coke=2000;
        
        answer=sheep*n+coke*k-coke*serviceN;
        return answer;
    }
}