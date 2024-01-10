package DOIT.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class P_2751 {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        Integer [] array = new Integer[N];
        for(int i=0; i<N; i++){
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

//        Arrays.sort(array, Collections.reverseOrder());
//        Arrays.sort(array, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 양수 두 수 바뀜, 음수 두 수 바뀌지 않음, 0은 그대로
//            }
//        });
        Arrays.sort(array, ((o1, o2) -> o2 - o1));




        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : array) {
            bw.write(i + "\n");
        }
        bw.flush();

    }

}
