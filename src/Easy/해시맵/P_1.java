package Easy.해시맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

public class P_1 {

    private static char solution(int cnt, String input){
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : input.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        Integer maxValue = Collections.max(hashMap.values());

        for(char key : hashMap.keySet()){
            if(Objects.equals(hashMap.get(key), maxValue)){
                answer = key;
            }

        }

        return answer;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        String input = br.readLine();
        System.out.println(solution(cnt, input));


    }
}
