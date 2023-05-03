package Easy.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램 작성
public class P_10 {
    private static int [] solution(String s, char t){
        char[] ac = s.toCharArray();
        int [] leftTarget = new int [ac.length];
        int [] rightTarget = new int [ac.length];
        int [] answer = new int[ac.length];
        int p = 100;

        for (int i=0; i<ac.length; i++){ // 자신의 왼쪽 기준에서의 타겟에 대한 증가
            p++;
            if(ac[i] == t){
                p = 0;
                leftTarget[i] = p;
            }
            leftTarget[i] = p;
        }

        p = 100; // p 초기화

        for(int j=ac.length-1; j>=0; j--){ // 자신의 오른쪽 기준에서의 타겟에 대한 증가
            p++;
            if(ac[j] == t){
                p = 0;
                rightTarget[j] = p;
            }

            rightTarget[j] = p;
        }

        for(int k=0; k<ac.length; k++){

            if(leftTarget[k] < rightTarget[k]){
                answer[k] = leftTarget[k];
            }else {
                answer[k] = rightTarget[k];
            }

        }




        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        String s = stringTokenizer.nextToken();
        char target = stringTokenizer.nextToken().charAt(0);

        System.out.println(Arrays.toString(solution(s, target)));

    }
}
