package Practice;
/*
* 호주식 투표 제도에선 투표권자가 모든 후보에 대해 선호도 순으로 순위를 매긴다.
* 처음에는 1순위로 선택한 것 만 집계. 한 후보가 50% 이상 득표 시 바로 선출된다.
* 하지만 50% 이상 득표한 후보가 없으면 가장 적은표를 받은 후보(둘 이상도 가능) 가 우선 탈락 된다.
* 그리고 이렇게 탈락된 후보를 1순위로 찍었던 표를 다시 집계. 아직 탈락 되지 않은 후보 가운데 가증 높은 선호도를 얻는 후보가 그 표를 얻는다.
* 이런 식으로 가장 약한 후보들을 탈락 시키면서 다음 순위의 탈락하지 않은 후보에게 표를 주는 과정을 50% 이상을 얻는 후보가 나오거나
* 탈락되지 않은 모든 후보가 동률이 될 때까지 반복한다.
*
* */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class HOJUSIC {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 총 후보자 수
        String[] memberList = new String[n];

        for (int i = 0; i < n; i++) {
            memberList[i] = br.readLine(); // 배열에 이름을 담음
        }

        Queue<Integer>[] voters = new LinkedList[1000]; // 0 ~ 999 번까지, 투표용지


        int count = 0; // 몇 명의 사람이 투표를 했는가
        int [] scoreBoard = new int[1000];
        String readLine = "";

        while((readLine = br.readLine()) != null && readLine.length() != 0){

            String [] memberNameList = readLine.split(" ");
            voters[count] = new LinkedList<>();

            openBallotPaper(voters, memberNameList, count, n);

            count++;
        }

        while(true){

            scoreBallotPaper(count, voters, scoreBoard);

            int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, scoreBoard[i]);
                if (scoreBoard[i] != -1) {
                    mini = Math.min(mini, scoreBoard[i]);
                }
            }

            // 과반수 또는 전부다 동점자인 경우
            if (maxi * 2 > count || maxi == mini) {
                for (int i = 0; i < n; i++) {
                    if (scoreBoard[i] == maxi) {
                        System.out.println(memberList[i]);
                    }
                }
                return;
            }

            for (int i = 0; i < n; i++) {
                if (scoreBoard[i] == mini) {
                    scoreBoard[i] = -1; // 탈락자 점수 -1 점
                } else if (scoreBoard[i] != -1) {
                    scoreBoard[i] = 0; // 점수판 0점 초기화
                }
            }




            }


        }





    private static void openBallotPaper(Queue<Integer>[] voters, String[] memberNameList, int count, int n) {

        voters[count] = new LinkedList<>();

        for(int i=0; i<n; i++){
            voters[count].add(Integer.parseInt(memberNameList[i]) -1);
        }
    }


    private static void scoreBallotPaper(int count, Queue<Integer>[] voters, int [] scoreBoard) {

        for(int i=0; i<count; i++){

            while(scoreBoard[voters[i].peek()] == -1){
                voters[i].poll();
            }
            scoreBoard[voters[i].peek()]++;
        }

    }






}


