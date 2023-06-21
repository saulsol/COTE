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
import java.util.StringTokenizer;

public class HOJUSIC {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 총 후보자 수
        String[] subMemberList = new String[n];

        int i = 0;

        while (i < n && n <= 20) {
            subMemberList[i] = br.readLine();
            i++;
        }


        int[][] likes = new int[1000][n];
        int voteMember = 0; // 총 투표자 수

        while (voteMember < 1000) {
            String line = br.readLine();
            if (line.isEmpty()) {
                break; // 빈 줄이면 반복문 종료
            }

            StringTokenizer likesTokenizer = new StringTokenizer(line, " ");

            for (int j = 0; j < n; j++) {
                likes[voteMember][j] = Integer.parseInt(likesTokenizer.nextToken());
            }

            voteMember++;
        }


        print(likes, voteMember);


    }

    private static void print(int[][] array, int count) {

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }

    }

}


//    // 1순위 집계
//    private static int first(int [][] array, int count, int memberCount){
//
//        int [] memberScore = new int[memberCount];
//
//
//        int index;
//        for(int i = 0; i<count; i++){
//            index = array[count][0] - 1;
//            memberScore[index] += 1;
//        }
//
//
//
//        // 최대값을 갖는 배열 index 리턴
//        int maxIndex;
//        int maxValue = memberScore[0];
//        for(int i=0; i<memberScore.length; i++){
//            if(maxValue < memberScore[i]){
//                maxValue = memberScore[i];
//                maxIndex = i;
//            }
//        }


