import static java.lang.String.valueOf;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = valueOf(x);

        String[] str2 = str.split("");

        int sum = 0;

        for (String num : str2) {
            sum += Integer.parseInt(num);
        }
        if (x % sum == 0) {
            return answer;
        }
        return false;
    }
}