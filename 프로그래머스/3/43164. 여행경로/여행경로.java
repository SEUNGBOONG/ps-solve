import java.util.*;
class Solution {
public String[] solution(String[][] tickets) {
        List<String> answer = new ArrayList<>();
        boolean[] visited = new boolean[tickets.length];

        // 항공권을 알파벳 순서대로 정렬
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));

        Stack<String> stack = new Stack<>();
        stack.push("ICN");  // 출발지는 항상 "ICN"
        answer.add("ICN");  // 방문 경로에도 추가

        if (!dfs(tickets, visited, stack, answer)) {
            return new String[0];  // 경로를 찾지 못했을 경우 빈 배열 반환
        }

        return answer.toArray(new String[0]);
    }

    public boolean dfs(String[][] tickets, boolean[] visited, Stack<String> stack, List<String> answer) {
        if (answer.size() == tickets.length + 1) {
            return true;  // 모든 항공권을 사용한 경우 경로 완성
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && stack.peek().equals(tickets[i][0])) {
                visited[i] = true;
                stack.push(tickets[i][1]);
                answer.add(tickets[i][1]);  // 방문한 공항 추가

                if (dfs(tickets, visited, stack, answer)) {
                    return true;
                }

                // 백트래킹: 원래 상태로 되돌리기
                visited[i] = false;
                stack.pop();
                if (!answer.isEmpty()) {  // 🚨 리스트가 비어있지 않을 때만 제거
                    answer.remove(answer.size() - 1);
                }
            }
        }
        return false;
    }
}