import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // Generate all possible combinations of 3 numbers
        List<int[]> combinations = generateCombinations(nums);

        // Check each combination
        for (int[] combination : combinations) {
            int sum = combination[0] + combination[1] + combination[2];
            if (isPrime(sum)) {
                answer++;
            }
        }

        return answer;
    }

    private List<int[]> generateCombinations(int[] nums) {
        List<int[]> combinations = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    combinations.add(new int[]{nums[i], nums[j], nums[k]});
                }
            }
        }

        return combinations;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}