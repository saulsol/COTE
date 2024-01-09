package DOIT.stackAndQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P_81 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int [] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        int num = 1;
        boolean result = true;

        for(int i=0; i < A.length; i++){
            int su = A[i]; // 현재 수열의 수
            if(su >= num){
                while (su >= num){
                    stack.push(num ++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            }else{
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    stringBuffer.append("-\n");
                }
            }
        }

        if(result) System.out.println(stringBuffer.toString());
    }
}
