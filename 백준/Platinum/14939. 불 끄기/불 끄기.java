

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    //모든 전구가 꺼져있을 때 전구 상태 변경하는 최소 횟수
    static int result = Integer.MAX_VALUE;
    //전구 정보
    static boolean[][] switches;
    //상하좌우 y, x 변경값
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        switches = new boolean[11][11];
        for(int i=1;i<=10;i++){
            String input = br.readLine();
            for(int j=1;j<=10;j++){
                switches[i][j] = input.charAt(j-1) == '#';
            }
        }
        search(1, 1, 0);
        if(result == Integer.MAX_VALUE){
            result = -1;
        }
        bw.write(String.valueOf(result));
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
    static void search(int y, int x, int cnt){
        if(cnt >= result){
            return;
        }

        if(x == 1){
            if(!check(y)){
                return;
            }
        }

        if(y == 11){
            if(check(12)){
                result = Math.min(result, cnt);
            }
            return;
        }
        int nxtY = y;
        int nxtX = x + 1;
        if(nxtX == 11){
            nxtY++;
            nxtX = 1;
        }

        if(!switches[y-1][x]){
            onOff(y, x);
            search(nxtY, nxtX, cnt+1);
            onOff(y, x);
        }
        search(nxtY, nxtX, cnt);
    }
    static void onOff(int y, int x){
        switches[y][x] = !switches[y][x]; 
        for(int i=0;i<4;i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(inSwitch(ny, nx)){
                switches[ny][nx] = !switches[ny][nx];
            }
        }
    }
    static boolean check(int y){
        if(y <= 2){
            return true;
        }
        int preY = y - 2;
        for(int i=1;i<=10;i++) {
            if (!switches[preY][i]) {
                return false;
            }
        }
        return true;
    }
    static boolean inSwitch(int y, int x){
        if(y >= 1 && y <= 10 && x >= 1 && x <= 10){
            return true;
        }
        return false;
    }
}
