package Easy_2.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성해라
public class P_4 {

    public static void solution(String [] array){

        for(int i=0; i<array.length; i++){
            array[i] = new StringBuilder(array[i]).reverse().toString();
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] sArray = new String[N];

        for(int i=0; i<N; i++){
            sArray[i] = br.readLine();
        }

        solution(sArray);
    }
}
