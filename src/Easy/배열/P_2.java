package Easy.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 보이는 학생의 수를 구하여라
public class P_2 {

    public static ArrayList<Integer> solution(int a []){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int standard = a[0];
        arrayList.add(standard);
        int i = 1;
        while (i<a.length){

            if(standard < a[i]){
                arrayList.add(standard);
                standard = a[i];
            }

            i++;
        }




        return arrayList;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> arrayList = solution(array);
        System.out.println(arrayList.size());


    }

}
