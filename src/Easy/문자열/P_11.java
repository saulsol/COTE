package Easy.문자열;

// 문자열 압축
// 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는디.
// KKHSSSSSSSE
// K2H2S7E


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P_11 {

    private static String solution(String s){

        // 빈 문자 상수를 추가하는 작업을 해줘야 한다
        String answer = "";
        s = s+ " ";

        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt ++;
            else {
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt); // 1보다 큰 경우에만 누적한다.
                cnt = 1;
            }
        }

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(solution(input));


    }
}
