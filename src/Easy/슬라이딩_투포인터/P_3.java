package Easy.슬라이딩_투포인터;

// 연속된 3일간 최고 매출을 구하여라


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_3 {

    private static int solution (int [] a, int days){

        int max = 0;
        int sum = 0;

        for(int i=0; i<a.length-days+1; i++){

            for(int j = i; j<days; j++ ){

                sum = sum + a[j];
                days = days + 1;
            }
            if(max < sum){
                max = sum;
            }

        }



        return max;
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int ArraySize = Integer.parseInt(tokenizer.nextToken());
        int days = Integer.parseInt(tokenizer.nextToken());
        int [] array = new int[ArraySize];

        tokenizer = new StringTokenizer(br.readLine());
        for(int i=0; i<ArraySize; i++){
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int answer = solution(array, days);
        System.out.println(answer);
    }
}
