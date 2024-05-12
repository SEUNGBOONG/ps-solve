class Solution {
    public boolean solution(int x) {
        int sum=0;
        boolean answer = false;
        String str = String.valueOf(x);
        String[] numArr=str.split("");
        for(String num:numArr){
            sum+=Integer.parseInt(num);
        }
        if(x%sum==0){
            answer=true;
        }
        return answer;
    }

}