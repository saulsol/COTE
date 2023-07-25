package Easy.슬라이딩_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연속된 자연수의 합
// 7 + 8 = 15
// 4 + 5 + 6 = 15
// 1 + 2 + 3 + 4 + 5 = 15
public class P_5 {

    private static int solution(int N){
        int sum = 0;
        int answer = 1; // 자기 자신 포함
        int lt = 0;
        int m = N / 2 + 1; // 몫 보다 1 더 크다

        int [] arr = new int[m];

        for(int i=0; i<m; i++)
            arr[i] = i+1; // 0부터 1씩

        for(int rt = 0; rt<m; rt ++){

            sum = sum + arr[rt];
            if(sum == N) answer ++;

            while(sum >= N) {
                sum = sum - arr[lt++];
                if(sum == N) answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = solution(n);
        System.out.println(a);
    }
}
