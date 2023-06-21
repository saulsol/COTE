package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class HoJuSicVote {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] name = new String[n]; //후보자들의 이름을 담을 배열 생성

        for (int i = 0; i < n; i++) {
            name[i] = br.readLine(); // 배열에 이름을 담음
        }
        String input = "";

        Queue<Integer> [] score = new LinkedList[1000]; // 0 ~ 999 번까지

        int count = 0;
        int[] v = new int[1000];


        while ((input = br.readLine()) != null && input.length() != 0) {

            String[] arr = input.split(" ");
            score[count] = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                score[count].add(Integer.parseInt(arr[i]) - 1);
            }
            count++;

        }


        while (true) {
            for (int i = 0; i < count; i++) {

                while (v[score[i].peek()] == -1) { // 점수판이 -1 인 경우에만 poll
                    score[i].poll();
                }
                v[score[i].peek()]++; // Q에 제일 먼저 들어온 값들만 뽑아냄
            }

            int maxi = 0, mini = 123456789;

            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, v[i]);
                if (v[i] != -1) {
                    mini = Math.min(mini, v[i]);
                }
            }
            // 과반수 또는 전부다 동점자인 경우
            if (maxi * 2 > count || maxi == mini) {
                for (int i = 0; i < n; i++) {
                    if (v[i] == maxi) {
                        System.out.println(name[i]);
                    }
                }
                return;
            }
            for (int i = 0; i < n; i++) {
                if (v[i] == mini) {
                    v[i] = -1; // 탈락자 점수 -1 점
                } else if (v[i] != -1) {
                    v[i] = 0; // 점수판 0점 초기화
                }
            }
        }
    }


}