import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();

        int size = (int)(max - min + 1);
        boolean[] isNotSquareFree = new boolean[size];

        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;
            long start = ((min + pow - 1) / pow) * pow;  // min 이상에서 pow의 배수 시작

            for (long j = start; j <= max; j += pow) {
                isNotSquareFree[(int)(j - min)] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!isNotSquareFree[i]) count++;
        }

        System.out.println(count);
    }
}
