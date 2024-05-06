class Solution {
    public int solution(int hp) {
        int answer = 0;
        int generalAnt, soldierAnt,workAnt;
        generalAnt=(hp/5);
        hp=(hp%5);
        soldierAnt=(hp/3);
        hp=hp%3;
        workAnt=hp/1;
        answer=generalAnt+soldierAnt+workAnt;
        return answer;
    }
}