package Mussa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        int [][] int2DArray = new int [3][4];
        int2DArray[0][1] = 10;

        for(int i=0; i<int2DArray.length; i++){

            for(int j=0; j<int2DArray[i].length; j++){
                System.out.printf("%d ", int2DArray[i][j] );
            }
            System.out.println();
        }


        int [][] arr = {{1,2}, {3,4}, {5,6,7}};
        System.out.println(Arrays.deepToString(arr));

        // 문자열 거꾸로 하기
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해 주세요 : ");
        String s = sc.nextLine();
        char [] ca = s.toCharArray();

        for(int i=ca.length-1; i>=0; i-- ){
            System.out.printf("%c", ca[i]);
        }

        System.out.println();
        System.out.println("--------------------------------------------------------");

        // 평균 구하기
        System.out.println("숫자를 띄어서 입력해 주세요!");
        System.out.println("몇 개의 숫자를 입력하실 건가요? : ");
        int n = sc.nextInt();

        int [] intArray = new int[n];
        int sum = 0;
        for(int i=0; i<intArray.length; i++){
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }

        double avg = (double) sum/n;
        System.out.println("평균 : " + avg);


        // 최대값과 최소값 동시에 구하기
        System.out.println("숫자를 띄어서 입력해 주세요!");
        System.out.println("몇 개의 숫자를 입력하실 건가요? : ");
        int n1 = sc.nextInt();
        int [] score = new int[n1];

        for(int i=0; i<n1; i++){
            System.out.print("숫자를 입력해 주세요! : ");
            score[i] = sc.nextInt();
        }


        int max = score[0];
        int min = score[0];

        for(int i=0; i<score.length; i++){

            if(max < score[i])
                max = score[i];

            if(min > score[i])
                min = score[i];
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);



        // 버블 소팅
        int [] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(nums));


        for(int i = nums.length-1; i>0; i--){

            for(int j=0; j<i; j++){

                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(nums));
    }

}
