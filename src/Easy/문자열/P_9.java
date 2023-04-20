package Easy.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자만 추출
// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만들어보자.



public class P_9 {


    private static int solution(String s){
        int answer = 0;
        char [] ac = s.toCharArray();
        for(int i=0; i<ac.length; i++){
            if(ac[i] >= 48 && ac[i] <= 57){
                answer = answer * 10 + (ac[i] - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));

    }
}
