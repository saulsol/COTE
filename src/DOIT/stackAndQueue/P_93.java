package DOIT.stackAndQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P_93 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        int answer = 0;

        for(int i=0; i<n; i++) {
            if(queue.size() == 1){
                answer = queue.peek();
                break;
            }

            queue.poll(); // 맨 위의 카드를 버림
            queue.add(queue.poll());// 맨 위의 카드를 버리고 리턴값을 맨 아래로 이동
        }

        System.out.println(answer);
    }
}
