import java.util.*;

class Solution {
    
  public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int idx = 0;
        int len = jobs.length;
        Queue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        while (!pq.isEmpty() || idx < len) {
            while (idx < len && jobs[idx][0] <= time) {
                pq.offer(jobs[idx++]);
            }

            if (pq.isEmpty()) {
                time = jobs[idx][0];
            } else {
                int[] job = pq.poll();
                time += job[1];
                answer += time - job[0];
            }
        }

        return answer/len;
    }
}