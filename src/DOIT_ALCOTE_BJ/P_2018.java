package DOIT_ALCOTE_BJ;

// 어떠한 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
// 15를 나타내는 방법은 7 + 8 / 4 + 5 + 6 / 1 + 2 + 3 + 4 + 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while(end != N){
            if(sum == N){
                cnt ++;
                end ++;
                sum = sum + end;
            }else if(sum > N){
                sum = sum - start;
                start++;
            }else{
                end ++;
                sum = sum + end;
            }
        }

        System.out.println(cnt);

    }

}
