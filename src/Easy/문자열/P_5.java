package Easy.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 특정 문자 뒤집기
// 알파벳이면 SWAP
// 알파벳 아니면 증가
public class P_5 {

    private static String solution(String s){
        String answer;
        int lt = 0;
        int rt = s.length()-1;

        char [] ca = s.toCharArray();

        while(lt<rt){
            if(!Character.isAlphabetic(ca[lt])){
                lt++; //lt가 알파벳이 아닌 경우
            }else if(!Character.isAlphabetic(ca[rt])){
                rt--;
            }else{
                char temp;
                temp = ca[lt];
                ca[lt] = ca[rt];
                ca[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(ca); // Char 타입 배열을 String 화 시켜준다.

        return answer;
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));

    }
}
