package Easy.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수열
public class P_4 {

    private static void solution(int cnt){

        int [] answer = new int[cnt];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<cnt; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        for(int i : answer){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        solution(cnt);



    }

}
