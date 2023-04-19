package Easy.문자열;


import java.io.*;
import java.util.*;

public class P_2 {

    public static String solution(String s){
        String answer = "";

        for(char x : s.toCharArray()){
            if(Character.isLowerCase(x))
                answer +=  Character.toUpperCase(x);

            else
                answer += Character.toLowerCase(x);
        }

        return answer;
    }

    // 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변경하는 프로그램
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();
        System.out.println(solution(readLine));



    }

}
