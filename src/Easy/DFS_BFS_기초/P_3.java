package Easy.DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 N이 입력되면 N!를 구하는 프로그램을 작성해봐
public class P_3 {

    private static int DFS(int n){

        if(n == 1){
            return 1;
        }else{
            return n * DFS(n-1);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(DFS(n));


    }
}
