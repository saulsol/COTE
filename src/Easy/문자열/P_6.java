package Easy.문자열;
// 중복 문자 제거
// ksetkset -> kset


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_6 {

    private static String solution(String s){
        String answer = "";
        for (int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) == i){ // 처음 나오는 문자이고 중복되지 않은 문자
                answer += s.charAt(i);
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
