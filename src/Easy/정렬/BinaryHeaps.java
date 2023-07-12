package Easy.정렬;

// 힙이란?
// 최대값이나 최소값을 찾아내는 연산을 빠르게 하기위해 고안된 연산 방법

// 최소 힙
// 작은 값을 항상 루트에 오게 한다.
// 부모 노드가 자식 노드보다 작은 값

// 최대 힙
// 가장 큰 값이 항상 루트에 오게 한다.
// 부모 노드가 자식 노드보다 큰 값

// 병합 정렬보단 아니다.
public class BinaryHeaps {

    static void swap(int [] a, int idx, int idx2){
        int temp = a[idx];
        a[idx] = a[idx2];
        a[idx2] = temp;
    }

    static void downHeap(int [] a, int left, int right) {
        int temp = a[left]; // 루트

        int child; // 큰 값을 가진 노드
        int parent; // 부모

        for (parent = left; parent < (right + 1) / 2; parent = child) {

            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl;

            if (temp >= a[child])
                break;
            a[parent] = a[child];
        }

        a[parent] = temp;

    }

    static void heapSort(int [] a, int n){
        for(int i = (n-1)/2; i>=0; i--){
            downHeap(a, i, n-1);
        }

        for(int i = n-1; i >0; i--){
            swap(a, 0, i-1);
            downHeap(a, 0, i - 1);
        }

    }




    public static void main(String[] args) {

    }

}
