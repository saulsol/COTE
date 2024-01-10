package DOIT.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P_1181 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String [] strings = new String[N];

        for(int i=0; i<N; i++) {
            strings[i] = bufferedReader.readLine();
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.length() == o2.length()){
                   return o1.compareTo(o2);
                }

                return o1.length() - o2.length();
            }
        });


        System.out.println(strings[0]);
        for(int i=1; i<strings.length; i++){
            if(!strings[i].equals(strings[i-1])){
                System.out.println(strings[i]);
            }
        }

    }
}
