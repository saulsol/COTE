package Easy.배열;

// A B 두 사람이 가위 바위 보 게임을 합니다. 총 N 번의 게임을 하여 A가 이기면 A를 출력
// B 가 이기면 B를 출력  비길 경우에 D 출력


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P_3 {
    private static void solution(int [] a, int [] b){

        char [] answer = new char[a.length];


        for(int i=0; i<answer.length; i++){

            if(a[i] == b[i]){
                answer[i] = 'D';
            }else{
                if(a[i] == 1 && b[i] == 2){
                    answer[i] = 'B';
                } else if (a[i] == 1 && b[i] == 3) {
                    answer[i] = 'A';
                } else if (a[i] == 2 && b[i] == 1) {
                    answer[i] = 'A';
                } else if (a[i] == 2 && b[i] == 3) {
                    answer[i] = 'B';
                } else if (a[i] == 3 && b[i] == 1) {
                    answer[i] = 'B';
                } else if (a[i] == 3 && b[i] == 2) {
                    answer[i] = 'A';
                }

            }

        }

        for(char c : answer){
            System.out.print(c + " ");
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int a [] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int b [] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        solution(a, b);







    }

}
