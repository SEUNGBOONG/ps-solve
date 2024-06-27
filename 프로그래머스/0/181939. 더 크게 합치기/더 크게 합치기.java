class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        int absum = Integer.parseInt(ab);
        int basum = Integer.parseInt(ba);

        return Math.max(absum, basum);
    }

}