package Easy.문자열;

import java.util.Scanner;

// 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내보자 -> 대소문자 구분 X
public class P_1 {

    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase(); // --> 전부 대문자로 변환
        t = Character.toUpperCase(t); // 기준 문자도 대문자로 변환

//        for(int i=0; i<str.length(); i++){
//          if(str.charAt(i) == t) answer ++; // 문자열 돌아가면서 인덱싱
//        }

        // 향상된 배열로 풀어보기

        for(char c : str.toCharArray()){ // str이 바로 올 수 있는 게 아니다. 저 공간은 배열 또는 컬렉션이 와야한다.
            if(c == t)
                answer ++;
        }



        return answer;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 하나를 읽어들이는 메서드
        char c = sc.next().charAt(0); // 0번째 문자 갖고와라
        System.out.println(P_1.solution(str, c));

    }

}
