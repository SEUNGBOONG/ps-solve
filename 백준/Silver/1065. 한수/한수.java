import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main a = new Main();
        Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
        
        System.out.println(a.solution(num));
    }

    public int solution(int N) {
        int count = 0;
        if (N < 100) {
            return N;
        } else {
            count = 99;

            for (int i = 100; i <= N; i++) {
                int hun = i/100;
                int tens = (i/10)%10;
                int one = (i%10);

                if((hun-tens)==(tens-one)){
                    count++;
                }
            }
        }

        return count;
    }
}
