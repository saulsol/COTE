package Easy.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_8 {

    // 앞에서 읽을 때나 위에서 읽을 때나 같은 문자열을 팰린드롬이라고 한다.
    // 문자열이 입력되면 해당 문자열이 팰린드롬이면 YES, 아니면 NO를 출력하는 프로그램을 작성
    private static String solution(String s){
        String answer = "YES";
        int lt = 0;
        int rt = s.length()-1;

        while(lt<rt){
            if(s.charAt(lt) != s.charAt(rt)){
                answer = "NO";
            }
            lt ++;
            rt --;
        }

        return answer;
    }

    private static String solution2(String s){
        String answer = "NO";
        String temp = new StringBuilder(s).reverse().toString(); // 팰린드롬은 리버스를 해도 같은 값으 나오기 때문에 StringBuilder 사용 가능
        if(s.equals(temp)) answer = "YES";

        return answer;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s.toLowerCase().replaceAll("[^a-z]", ""))); // 대소문자 구문 없기 때문에
        System.out.println(solution2(s.toLowerCase().replaceAll("[^a-z]", ""))); // 대소문자 구문 없기 때문에

        // replaceAll(); -> 정규식에 해당되지 않는 값들은 빈 문자열로 변환

    }
}
