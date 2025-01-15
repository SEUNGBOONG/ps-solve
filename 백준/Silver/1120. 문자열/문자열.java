
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int result = Integer.MAX_VALUE;
        
        for(int i=0; i<=B.length()-A.length(); i++){
            int count = 0;
            for(int j=0; j<A.length(); j++){
                if(A.charAt(j)!=B.charAt(j+i)){
                    count ++;
                }
            }
            result = Math.min(count, result);
        }
        System.out.println(result);
    }
}
