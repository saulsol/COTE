package Easy_2.문자열;

// 대문자와 소문자가 존재하는 문자열을 같이 받아 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하는 프로그램 작

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2 {
    public static void solution(String str){
        char [] cArray = str.toCharArray();
        StringBuilder stringBuilder =new StringBuilder();
        for (char c : cArray) {
            if(Character.isLowerCase(c)){
                stringBuilder.append(Character.toUpperCase(c));
            }else{
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        solution(bufferedReader.readLine());

    }
}
