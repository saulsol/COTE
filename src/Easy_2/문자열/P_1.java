package Easy_2.문자열;

import java.util.Scanner;

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(solution(s, c));


    }
}
