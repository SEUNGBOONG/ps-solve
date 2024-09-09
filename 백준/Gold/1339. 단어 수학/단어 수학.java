

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[]wordCharArr = br.readLine().toCharArray();
            int wordLen = wordCharArr.length;
            int score = 1;
            for (int j = 1; j < wordLen; j++) {
                score *= 10;
            }
            for (int j = 0; j < wordLen; j++) {
                int value = score;
                score/=10;
                if(hashMap.containsKey(wordCharArr[j])) hashMap.put(wordCharArr[j], hashMap.get(wordCharArr[j])+value);
                else {
                    hashMap.put(wordCharArr[j], value);
                }
            }
        }
        PriorityQueue<Integer> heapScore = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer value : hashMap.values()) {
            heapScore.add(value);
        }

        int maxSum = 0;
        int putValue = 9;
        while(!heapScore.isEmpty()){
            maxSum += heapScore.poll()*putValue;
            putValue--;
        }
        System.out.println(maxSum);
    }
}
