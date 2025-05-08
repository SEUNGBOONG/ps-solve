class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        // 시작 위치 찾기
        int x = 0, y = 0;
        for (int i = 0; i < h; i++) {
            int idx = park[i].indexOf("S");
            if (idx != -1) {
                x = i;
                y = idx;
                break;
            }
        }

        // 방향 설정
        int[] dx = {0, 0, 1, -1};  // E, W, S, N
        int[] dy = {1, -1, 0, 0};
        String[] dir = {"E", "W", "S", "N"};

        for (String route : routes) {
            String[] split = route.split(" ");
            String d = split[0];
            int step = Integer.parseInt(split[1]);

            int dirIdx = 0;
            for (int i = 0; i < 4; i++) {
                if (d.equals(dir[i])) {
                    dirIdx = i;
                    break;
                }
            }

            int nx = x;
            int ny = y;
            boolean canMove = true;

            for (int i = 0; i < step; i++) {
                nx += dx[dirIdx];
                ny += dy[dirIdx];

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= h || ny >= w) {
                    canMove = false;
                    break;
                }

                // 장애물 체크
                if (park[nx].charAt(ny) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}
