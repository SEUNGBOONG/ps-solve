import java.util.Arrays;

public class Main {

    static boolean[] isSelfNum;

    public static void main(String[] args) {

        isSelfNum = new boolean[10001];
        Arrays.fill(isSelfNum, true);


        for (int i = 1; i <= 10000; i++) {
            if(isSelfNum[i])
                markNonSelfNum(i);
        }


        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if(isSelfNum[i])
                result.append(i + "\n");
        }
        System.out.println(result);
        
    }


    static void markNonSelfNum(int i) {
        int sum;
        int j;

        while(true){
            sum = i;
            j = i;

            while(j > 0){      
                sum += j % 10;
                j /= 10;
            }

            if(sum > 10000)
                break;

            isSelfNum[sum] = false;
            i = sum;
        }
    }
}