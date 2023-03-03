package DOIT;

// 숫자의 합 구하기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_31 {
    public static void main(String[] args) throws Exception {

        // 숫자의 합 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        char [] cNum = s.toCharArray();

        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';
        }

        System.out.println(sum);


    }

}
