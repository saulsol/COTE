package Easy.문자열;
// 회문 문자열

// 앞에서 읽을 때나 뒤에서 읽을 떄나 같은 문자열을 회문 문자열이라고 한다.
// 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO" 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_7 {
    
    // 내가 만든 답
    private static String solution(String s){
        String answer ="";
        String reverseS = new StringBuilder(s).reverse().toString();
        if(s.equals(reverseS)){
            answer = "YES";
        }else {
            answer = "NO";
        }
        return answer;
    }

    // 강사님이 만든 답
    private static String solution2(String s){
        String answer = "YES";
        int len = s.length();

        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)) answer = "NO";
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toLowerCase(); //소문자 변경
        System.out.println(solution(str));


    }

}
