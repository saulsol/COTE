package DOIT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P_38 {
    // 새로운 방식으로 평균 구하기
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] a = new int[N];
        for(int i=0; i<N; i++){
            a[i] = scanner.nextInt();
        }

        int max = 0;
        int sum = 0;

        // 점수 중 최대값 구하기, 점수의 총 합 구하기
        for(int i=0; i<N; i++){

            if(max < a[i]){
                 max = a[i];
            }
            sum += a[i];
        }

        // 평균 구하기
        double average = sum * 100.0 / max / N;
        System.out.println(average);



    }
}
