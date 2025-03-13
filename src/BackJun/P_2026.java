package BackJun;

import java.io.*;
import java.util.StringTokenizer;

public class P_2026 {

    static boolean [][] graph;
    static boolean [] visited;
    static int N, M;
    static int answer;

    public static void dfs(int index){
        visited[index] = true;
        answer ++;
        for(int i=1; i <= N; i++){
            if(visited[i] == false && graph[index][i])
                dfs(i);
        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N + 1];

        int x, y;
        for(int i=0; i<M; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            x = Integer.parseInt(tokenizer.nextToken()) - 1;
            y = Integer.parseInt(tokenizer.nextToken()) - 1;

            graph[x][y] = true;
            graph[y][x] = true;
        }
        dfs(0);
        System.out.println(answer - 1);
    }
}
