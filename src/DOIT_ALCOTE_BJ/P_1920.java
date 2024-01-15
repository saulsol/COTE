package DOIT_ALCOTE_BJ;

// N개의 정수가 주어질 때 이 안에 M개의 정수 X가 존재하는지 판단해라

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P_1920 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bufferedReader.readLine());
        String readLine = bufferedReader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(readLine, " ");

        Set<Integer> set = new HashSet<>();
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            set.add(Integer.parseInt(token));
        }

        int questions = Integer.parseInt(bufferedReader.readLine());
        String readLine2 = bufferedReader.readLine();
        StringTokenizer tokenizer2 = new StringTokenizer(readLine2, " ");

        while(questions -- >= 0 && tokenizer2.hasMoreTokens()){
            int a = Integer.parseInt(tokenizer2.nextToken());
            int exist = set.contains(a) ? 1 : 0;
            System.out.println(exist);
        }

    }
}
