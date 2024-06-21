class Solution {
  public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 윤년의 일 수
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        int count = -1; // 0~365일

        for (int i=0; i<a-1; i++) {
            count += month[i];
        }

        return day[(count+b)%7];
    }
}