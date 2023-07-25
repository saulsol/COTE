package Easy.슬라이딩_투포인터;

// 3
// 1 3 5

// 5
// 2 3 6 7 9
// 두 배열을 순서대로 나오겠끔 합쳐라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class P_1 {

    private static ArrayList<Integer> solution(int a_count, int [] a, int b_count, int [] b){
        ArrayList<Integer> answer = new ArrayList<>();

        int ap = 0;
        int bp = 0;

        while(ap<a_count && bp<b_count){
            if(a[ap] < b[bp]){
                answer.add(a[ap++]);
            }else {
                answer.add(b[bp++]);
            }
        }

        while (ap<a_count){
            answer.add(a[ap++]);
        }
        while (bp<b_count){
            answer.add(b[bp++]);
        }


        return answer;

    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int a_count = Integer.parseInt(tokenizer.nextToken());
        int [] a = new int[a_count];



        tokenizer = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<a_count; i++){
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(br.readLine());
        int b_count = Integer.parseInt(tokenizer.nextToken());
        int [] b = new int[b_count];

        tokenizer = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<b_count; i++){
            b[i] = Integer.parseInt(tokenizer.nextToken());
        }


        ArrayList<Integer> arrayList = solution(a_count, a, b_count, b);
        System.out.println(arrayList);

    }
}
