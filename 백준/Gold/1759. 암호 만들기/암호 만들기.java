

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 암호의 길이
        int count = scanner.nextInt(); // 사용할 문자 개수
        scanner.nextLine(); // 개행 제거
        String[] english = scanner.nextLine().split(" "); // 문자 배열 입력

        Arrays.sort(english); // 사전순 정렬

        List<String> result = new ArrayList<>();
        generatePassword(number, 0, "", english, result);

        for (String password : result) {
            System.out.println(password);
        }
    }

    // 암호 생성 메서드
    public static void generatePassword(int length, int start, String current, String[] letters, List<String> result) {
        // 길이가 원하는 암호 길이와 같으면 유효성 검사
        if (current.length() == length) {
            if (isValid(current)) {
                result.add(current);
            }
            return;
        }

        // 조합 생성 (백트래킹)
        for (int i = start; i < letters.length; i++) {
            generatePassword(length, i + 1, current + letters[i], letters, result);
        }
    }

    // 유효성 검사: 최소 1개의 모음과 2개의 자음을 포함하는지 확인
    public static boolean isValid(String password) {
        int vowels = 0; // 모음 개수
        int consonants = 0; // 자음 개수
        for (char c : password.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return vowels >= 1 && consonants >= 2;
    }
}
