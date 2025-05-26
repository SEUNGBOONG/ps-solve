import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    boolean[][] arr;
    ArrayList<Pos> piece;
    int n;
    int answer = Integer.MAX_VALUE;

    private boolean chk() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j]) {
                    Stack<Pos> stk = new Stack<>();
                    stk.add(new Pos(i, j));
                    boolean[][] v = new boolean[5][5];
                    v[i][j] = true;
                    int cnt = 0;
                    while (!stk.isEmpty()) {
                        Pos cur = stk.pop();
                        cnt++;
                        for (int dr = -1; dr <= 1; dr++) {
                            for (int dc = -1; dc <= 1; dc++) {
                                if (((dr^dc)&1)!=1) continue;
                                int nr = cur.r+dr;
                                int nc = cur.c+dc;
                                if (nr<0||nr>=5||nc<0||nc>=5||v[nr][nc]||!arr[nr][nc]) continue;
                                v[nr][nc] = true;
                                stk.push(new Pos(nr, nc));
                            }
                        }
                    }
                    if (cnt == n) return true;
                    return false;
                }
            }
        }
        return false;
    }

    private void bf(int idx, int sum) {
        if (answer <= sum) return;
        if (idx == n) {
            if (chk())
                answer = sum;
            return;
        }

        for (int nr = 0; nr < 5; nr++) {
            for (int nc = 0; nc < 5; nc++) {
                if (arr[nr][nc]) continue;
                int dist = Math.abs(piece.get(idx).r-nr) + Math.abs(piece.get(idx).c-nc);
                arr[nr][nc] = true;
                bf(idx+1, sum+dist);
                arr[nr][nc] = false;
            }
        }
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        piece = new ArrayList<>();
        arr = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            String row = br.readLine();
            for (int j = 0; j < 5; j++) {
                if (row.charAt(j) == '*')
                    piece.add(new Pos(i, j));
            }
        }
        n = piece.size();
        bf(0, 0);
        System.out.println(answer);
    }

    class Pos {
        int r, c;
        public Pos(int r, int c) { this.r=r; this.c=c; }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}