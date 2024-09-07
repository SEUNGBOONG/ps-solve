import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int M = Integer.parseInt(br.readLine()); 
        String[] input = br.readLine().split(" ");
        int[] materials = new int[N]; 

        for (int i = 0; i < N; i++) {
            materials[i] = Integer.parseInt(input[i]);
        }

        int cnt = 0;
        Arrays.sort(materials); 

        int start = 0; 
        int end = N - 1;

        while (start < end) {
            int sum = materials[start] + materials[end];
            if (sum == M) { 
                cnt++; 
                start++;
                end--;
            } else if (sum < M) { 
                start++;
            } else if (sum > M) { 
                end--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}