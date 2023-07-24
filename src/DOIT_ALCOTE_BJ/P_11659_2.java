package DOIT_ALCOTE_BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간합 구하기
// 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 출력한다.
// 5 3 -> 5개의 데이터가 준비되고 3번 물어보겠다
// 5 4 3 2 1
// 1 3 -> 5 + 4 + 3 = 12
// 2 4 -> 4 + 3 + 2
// 5 5 -> 1
public class P_11659_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(tokenizer.nextToken());
        int quizNo = Integer.parseInt(tokenizer.nextToken());

        long [] S = new long[suNo + 1];
        tokenizer = new StringTokenizer(br.readLine()); // 새로운 라인을 읽음

        for(int i = 1; i<= suNo; i++ ){
            S[i] = S[i-1] + Integer.parseInt(tokenizer.nextToken());
        }

        for(int q=0; q<quizNo; q++){
            tokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }








    }
}
