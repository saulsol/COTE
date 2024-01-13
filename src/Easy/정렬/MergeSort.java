package Easy.정렬;

public class MergeSort {

    private static void mergeSort(int [] arr){
        int [] tmp = new int[arr.length]; // 임시 저장소
        mergeSort(arr, tmp, 0, arr.length-1);

    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end){
        if(start < end) { // 시작 인덱스가 끝 인덱스 보다 작은 동안만 재귀 호출
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);

        }
    }

    private static void merge(int [] arr, int [] tmp, int start, int mid, int end){
        for(int i = start; i <= end; i++){
            tmp[i] = arr[i];// 범위까지 배열 복사
        }
        int part1 = start; // 파트 분배
        int part2 = mid + 1;
        int index = start; // 진짜 배열 인덱스 지정

        while (part1 <= mid && part2 <= end) {
            if(tmp[part1] <= tmp[part2]){
                arr[index] = tmp[part1];
                part1++;
            }else {
                arr[index] = tmp[part2];
                part2 ++;
            }
            index ++;
        }

        for(int i=0; i<= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }

    }


    public static void main(String[] args) {

        int [] arr = {3, 6, 2, 1, 9, 7, 4, 5};
        mergeSort(arr);

        System.out.println("====================병합정렬 후====================");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



}
