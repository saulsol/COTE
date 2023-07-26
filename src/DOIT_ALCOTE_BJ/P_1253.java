package DOIT_ALCOTE_BJ;

// 10
// 1 2 3 4 5 6 7 8 9 10  => 좋은 수 개수 8개
// 좋은 수 : 서로 다른 수의 합으로 이루어진 수


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1253 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] array = new int [n];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(array); // 배열 정렬

        int i;
        int j;
        int count = 0;

        for(int k=0; k<n; k++){

            i = 0;
            j = n - 1;

            while(i<j){

                if(i != k && j != k){
                    if(array[i] + array[j] < array[k]){
                        i++;
                    } else if (array[i] + array[j] > array[k]) {
                        j--;
                    } else { // array[i] + array[j] == array[k]
                        count ++;
                        break;
                    }

                } else if (i == k) {
                    i++;
                } else if (j == k) {
                    j--;
                }

            }

        }

        System.out.println(count);
        br.close();

    }

}
