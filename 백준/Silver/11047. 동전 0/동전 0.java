
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int num = 0;
        int last = k;
        int count = 0;

        while (!stack.empty()) {
            if (last == 0 || last < 0)
                break;
            num = stack.pop();
            if (num <= last) {
                count += last / num;
                last = last % num;
            }
        }

        System.out.println(count);

    }
}
