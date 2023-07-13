package Easy.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 에라토스테네스의 체
// 소수를 구해라
// 2는 무조건 소수이고 1과 자기 자신을 빼고 나누어 떨어지는 경우가 없는 수
// 즉 2부터 n-1까지의 어떤 정수로도 나누어떨어지지 않는 정수
public class P_5 {

    // 소수의 개수 구하기
    private static int solution(int n){
        int answer = 0;
        int [] ch = new int [n+1];
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                answer ++;
                for(int j=i; j<=n; j=j+i){
                    ch[j]=1;
                }
            }
        }

        return answer;
    }

    // 소수의 나열
    private static void solution2(int N){

        for(int j=2; j<=N; j++){
            int i;
            for(i = 2; i<j; i++){
                if(j % i == 0) break;
            }

            if(j == i)
                System.out.print(j + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        solution2(N);
        System.out.println(solution(N));

    }
}
