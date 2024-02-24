package Easy_2.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_3 {
    public static void solution(String str){
        String [] sArray = str.split(" ");
        int maxLength = -1;
        String answer = "";
        for(String s : sArray){
            if(s.length() > maxLength){
                maxLength = s.length();
                answer = s;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
