

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        // 1 1 2 3 6 7 30

        int sum=0;
        for(int i=0; i<n; i++) {
            if(arr[i] > sum+1) break;
            sum+= arr[i];
        }
        System.out.println(sum+1);
    }
}
