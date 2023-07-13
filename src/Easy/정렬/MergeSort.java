package Easy.정렬;

public class MergeSort {
    public static int[] buff;                    //임시 배열

    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int i;
            int center = (left + right) / 2;      //
            int p = 0;                            //임시 배열 인덱스
            int j = 0;
            int k = left;                        //원본 배열 인덱스

            mergeSort(arr, left, center);        //배열 앞부분 병합정렬
            mergeSort(arr, center+1, right);    //배열 뒷부분 병합정렬

            for(i = left; i <= center; i++) {    //임시 배열에 배열 앞부분을 넣어줌.
                buff[p++] = arr[i];
            }

            while(i <= right && j < p) {        //원본 배열의 뒷부분, 추가 배열의 앞부분의 원소끼리 비교한다.
                arr[k++] = buff[j] <= arr[i] ? buff[j++] : arr[i++];
            }

            while(j < p) {                        //임시 배열의 앞부분이 모두 커서 선택이 안됐다면 원본배열 뒷부분에 붙혀준다.
                arr[k++] = buff[j++];            //여기서 왜 i < right는 비교를 안할까? -> 비교를 하면서 선택을 못받은 잠재적 i값(큰 값)들은 원본배열 뒷부분에 있기 때문이다.
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 6, 8, 9, 5};
        int N = arr.length;
        buff = new int[N];

        mergeSort(arr, 0, N-1); // 0부터 배열의 인덱스 만큼 돌려라

        for(int a : arr) {
            System.out.print(a+" ");
        }

    }
}
