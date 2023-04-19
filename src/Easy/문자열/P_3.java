package Easy.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력
public class P_3 {

    public static String solution(String s){
       String answer = "";
       int min = Integer.MIN_VALUE; // 최소값

       String [] splitValue = s.split(" ");
        for (String v : splitValue) {
            int len = v.length();
            if(min < len){
                min = len;
                answer = v;
            }
        }

       return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();
        System.out.println(solution(readLine));


    }


}
