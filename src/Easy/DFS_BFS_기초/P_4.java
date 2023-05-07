package Easy.DFS_BFS_기초;

// 피보나치 수열을 출력한다.
// 재귀함수로 풀어야 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_4 {

    private static int DFS(int n){

        if(n==1) return 1;
        else if(n==2) return 1;

        else return DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 몇 번 재귀를 돌지
        for(int i=1; i<=n; i++) { // i가 0일 때 종료 조건은 없으니깐 0을 해버리면 StackOverFlow
            System.out.print(DFS(i) + " ");
        }
        // for 문, 배열, 재귀함수 중 파보나치 수열을 출력하는데 있어서 어떤 것이 더 성능이 좋다
        // -> for 문과 배열이 제일 좋다.

        // 재귀함수는 무겁다...


    }

}
