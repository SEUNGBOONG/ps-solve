import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int tc = 1;

        while (n-- > 0) {
            Stack<String> stk = new Stack<>();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                stk.push(st.nextToken());

            sb.append("Case #").append(tc++).append(": ");
            while (!stk.empty())
                sb.append(stk.pop()).append(" ");
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }

}