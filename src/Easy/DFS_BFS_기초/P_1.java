package Easy.DFS_BFS_기초;

// 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N 까지를 출력하는 프로그램을 작성하시오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1 {
    private static void DFS(int n){

        if(n == 0)
            return;

        DFS(n-1);
        // 계속 자기 자신을 호출하면서 점점 작은 값의 매개변수를 받는다.
        // 그리고 매개변수로 받은 값이 0이 되는 순간 종료조건을 작성해야 한다.

        System.out.print(n + " ");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rv = Integer.parseInt(br.readLine());

        DFS(rv);


    }

}
