package Easy.정렬;


// N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램 작성
// 정렬하는 방법은 선택 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {
    private static void solution(int[] v, int count) {
        int idx;
        int temp;

        for (int i = 0; i < count - 1; i++) {
            idx = i; // 현재 인덱스를 초기화

            // 최솟값을 찾기 위해 현재 인덱스(i) 다음부터 배열 끝까지 탐색
            for (int j = i + 1; j < count; j++) {
                if (v[j] < v[idx]) {
                    idx = j; // 최솟값의 인덱스로 갱신
                }
            }

            // 현재 인덱스(i)와 최솟값의 인덱스(idx)에 해당하는 요소를 교환
            temp = v[i];
            v[i] = v[idx];
            v[idx] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine()); // 정렬할 요소의 개수 입력
        int[] values = new int[count]; // 입력된 요소를 저장할 배열
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        // 입력된 요소를 배열에 저장
        for (int i = 0; i < count; i++) {
            values[i] = Integer.parseInt(tokenizer.nextToken());
        }

        solution(values, count); // 배열을 선택 정렬로 정렬

        // 정렬된 배열 출력
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d ", values[i]);
        }
    }
}








