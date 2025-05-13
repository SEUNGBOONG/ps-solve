class Solution {// 3 2. 5 
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            long idx = left + i;
            long row = idx / n;
            long col = idx % n;
            answer[i] = (int)(Math.max(row, col) + 1);
        }

        return answer;
    }}
