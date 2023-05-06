package Easy.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성해라
// 단 재귀함수를 사용해야 한다.
public class P_2 {

    private static void DFS(int n){
        // 몫이 0이 될 때까지 계속 나눠준다.
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2); // 마지막에 나눈 나머지 부터 출력해야 하니깐
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rv = Integer.parseInt(br.readLine());

        DFS(rv);


    }

}
