package Easy.스택;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 알맞은 짝의 괄호 찾기
public class P_1 {

    public static String solution(String str) {

        Stack<Character> characters = new Stack<>();

        for(char x : str.toCharArray()){

            if(x == '('){
                characters.push(x);
            }else{
                if(characters.isEmpty()){
                    return "NO";
                }
                characters.pop();
            }
        }

        if(!characters.isEmpty()){
            return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        System.out.println(solution(str));

    }
}
