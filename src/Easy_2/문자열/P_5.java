package Easy_2.문자열;
// 영어 알파벳과 특수 문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로
// 있는 문자열을 만들어 출력하는 프로그램을 작성하세요

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_5 {

    public static void solution(String s){
        char [] cArray = s.toCharArray();
        int lt = 0;
        int rt = cArray.length - 1; // lt 가 0부터 시작하니까
        char temp;
        while(lt < rt){
            if(!Character.isAlphabetic(cArray[lt])){
                lt++;
            }else if(!Character.isAlphabetic(cArray[rt])){
                rt--;
            }else{
                temp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        String answer = String.valueOf(cArray);
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());

    }
}
