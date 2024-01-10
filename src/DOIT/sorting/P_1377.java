package DOIT.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_1377 {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        Data [] datas = new Data[N];

        for(int i=0; i<N; i++){
            datas[i] = new Data(Integer.parseInt(bufferedReader.readLine()), i);
        }

        Arrays.sort(datas);
        int Max = 0;
        for(int i=0; i<N; i++){
            if(Max < datas[i].index - i){
                Max = datas[i].index - i;
            }
        }

        System.out.println(Max + 1);

    }
}


class Data implements Comparable<Data> {

    int value;
    int index;

    public Data(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Data o) {
        return this.value - o.value;
    }
}
