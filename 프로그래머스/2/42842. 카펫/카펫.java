class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;


        for (int height = 1; height <= sum; height++) {
            if (sum % height == 0) {
                int width = sum / height;
                if (width >= height && (width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }


        }
        return answer;
    }
}