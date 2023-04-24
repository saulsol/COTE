package Easy.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램 작성
public class P_10 {
    private static String solution(String s, char t){
        String answer = "";
        char [] ca = s.toCharArray();
        int count = 0;
        int [] ia = new int[ca.length];

        // 순행
        for(int i=0; i<ia.length; i++){
            if(ca[i] == t){
                count = 0;
                ia[i] = count;
            }
            ia[i] = ++count;
        }

        count = 0;

        // 역순
        for(int i=ia.length-1; i>=0; i--){
            if(ca[i] == t){
                count = 0;
                ia[i] = count;
            }

            count++;

            if(ia[i]>count){
                ia[i] = count;
            }

        }


        // 출력
        for(int i=0; i<ia.length; i++ ){
            answer = answer + ia[i] + " ";
        }
        

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        String s = stringTokenizer.nextToken();
        char target = stringTokenizer.nextToken().charAt(0);

        System.out.println(solution(s, target));

    }
}
