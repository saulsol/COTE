package Easy.정렬;
// 퀵소트로 해보자
// 피봇을 정한 뒤 피봇의 위치를 확장해가며 정렬
// 기준(피봇)을 잡고 해당 기준 보다 작으면 왼쪽 크면 오른쪽으로 둔다.
public class QuickSort {

    private static void quickSort(int [] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int [] arr, int start, int end){
        int part2 = partition(arr, start, end);
        if(start < part2 - 1){
            quickSort(arr, start, part2 - 1);
        }
        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int [] arr, int start, int end){

        int pivot = arr[(start + end) / 2]; // 중앙에 있는 값 피봇
        while(start <= end){

            while (arr[start] < pivot) start ++;
            while (arr[end] > pivot) end --;

            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }

        }
         // start 지점이 end 지점을 역전했을 경우 리턴
        return start;
    }

    private static void swap(int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }



    public static void main(String[] args) {

        int [] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};

        quickSort(arr);
        for (int i : arr) {
            System.out.printf("%d ", i);
        }



    }
}
