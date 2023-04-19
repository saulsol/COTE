package Easy.문자열;
import java.util.*;
import java.io.*;
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램 작성
// Good -> dooG


public class P_4 {

    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String [] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = st.nextToken();
            System.out.println("기존 값 :" + s[i]);
        }

        System.out.println(solution(n,s));

    }
}
