

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("-");

        int result = 0;
        int count = 0;

        for (String s : input) {

            String[] numbers = s.split("\\+");
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }

            if (count == 0) {
                result += sum;
                count++;
            }
            else {
                result -= sum;
            }

        }
        System.out.println(result);
    }
}
