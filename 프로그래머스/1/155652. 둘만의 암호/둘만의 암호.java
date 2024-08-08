class Solution {
 public String solution(String s, String skip, int index) {
        char[] list = s.toCharArray();

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < index; j++) {
                list[i] = (char) ((list[i] - 'a' + 1) % 26 + 'a');

                while (skip.contains(String.valueOf(list[i]))) {
                    list[i] = (char) ((list[i] - 'a' + 1) % 26 + 'a');
                }
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(list); 

        return result.toString();
    }
}