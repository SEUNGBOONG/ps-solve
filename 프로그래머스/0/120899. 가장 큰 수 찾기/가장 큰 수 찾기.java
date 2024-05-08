class Solution {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }
}