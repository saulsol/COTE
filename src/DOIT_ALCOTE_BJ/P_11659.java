package DOIT_ALCOTE_BJ;
// 구간합 구하기
// 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 출력한다.
// 5 3 -> 5개의 데이터가 준비되고 3번 물어보겠다
// 5 4 3 2 1
// 1 3 -> 5 + 4 + 3 = 12
// 2 4 -> 4 + 3 + 2
// 5 5 -> 1


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P_11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] sAndQ = br.readLine().split(" ");

        int [] v = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int times = Integer.parseInt(sAndQ[1]);
        String [] inputLength;
        int sums [] = new int[times];

        for(int i=0; i<times; i++){

            inputLength = br.readLine().split(" ");

            int sum = 0;
            for(int j= Integer.parseInt(inputLength[0]) - 1; j<Integer.parseInt(inputLength[1]); j++ ){

                sum = sum + v[j];
            }

            sums[i] = sum;

        }


        for(int i=0; i<sums.length; i++){
            System.out.print(sums[i] + " ");
        }

    }

}
