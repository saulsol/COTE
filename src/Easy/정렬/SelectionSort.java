package Easy.정렬;


// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램 작성
// 정렬하는 방법은 선택 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {

    private static void solution(int [] v, int count){

        int idx = 0;
        int temp;

        for (int i=0; i<count-1; i++){
            idx = i; // 초기화 해야함
            for(int j=i+1; j<count; j++){
                if(v[j] < v[idx]){
                    idx = j;
                }

            }

            temp = v[i];
            v[i] = v[idx];
            v[idx] = temp;
        }


    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int [] values = new int[count];
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<count; i++){
            values[i] = Integer.parseInt(tokenizer.nextToken());
        }


        solution(values, count);

        for(int i=0; i< values.length; i++){
            System.out.printf("%d ", values[i]);
        }


    }

}
