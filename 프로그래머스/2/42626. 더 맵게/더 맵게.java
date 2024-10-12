
import java.util.PriorityQueue;
import java.util.Queue;
class Solution {
 public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> heap = new PriorityQueue<>();

        // 배열의 모든 요소를 힙에 추가
        for (int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }

        // 힙에서 가장 작은 값이 K 이상이 될 때까지 혼합
        while (heap.size() > 1 && heap.peek() < K) {
            int firstNumber = heap.poll();
            int secondNumber = heap.poll();

            int newScoville = firstNumber + (secondNumber * 2);
            heap.add(newScoville);
            answer++;
        }

        // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우 -1 반환
        if (heap.peek() < K) {
            return -1;
        }

        return answer;
    }
}