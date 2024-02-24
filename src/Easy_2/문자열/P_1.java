package Easy_2.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P_1 {

    public static int solution(String str, char t){
        int answer = 0;
        char [] cArray = str.toLowerCase().toCharArray();

        for(int i=0; i < cArray.length; i++){
            if(cArray[i] == Character.toLowerCase(t)){
                answer = answer + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.println(solution(s, c));


    }
}
