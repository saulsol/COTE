package Easy.배열;

// 1~100개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성해봐라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1 {

    public static void solution(int [] s){

        for(int i=0; i<s.length-1; i++) {

            if (i == 0) {
                System.out.print(s[i] + " ");
            }
            if(s[i] < s[i+1] ){
                System.out.print(s[i+1] + " ");
            }

        }

    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        solution(array);

    }
}
