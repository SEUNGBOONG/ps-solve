class Solution {
 public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];

        for(int i = 0; i < computers.length; i++){
            visited[i] = false;
        }
        // 방문안했다고 다 처리해 두는 것

        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, visited, computers);
            }
        }

        return answer;
    }

    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;

        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i, visited, computers);
            }
        }
    }
}