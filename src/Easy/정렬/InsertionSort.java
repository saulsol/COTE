package Easy.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 짜봐라
// 정렬하는 방법은 삽입 정렬
public class InsertionSort {
    private static void solution(int [] ints){

        int tmp;
        for(int i=1; i<ints.length; i++){
            tmp = ints[i];
            int j;
            for(j = i-1; j >= 0; j--){
                if(ints[j]>tmp){
                     ints[j+1] = ints[j];
                }else{
                    break;
                }
            }
            ints[j+1] = tmp;
        }
        System.out.println(Arrays.toString(ints));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int cnt = Integer.parseInt(input);

        int [] values = new int[cnt];

        String readLine = br.readLine();


        StringTokenizer tokenizer = new StringTokenizer(readLine, " ");

        for(int i=0; i<values.length; i++){
            values[i] = Integer.parseInt(tokenizer.nextToken());
        }

        solution(values);


    }
}
