package Easy.정렬;

// 힙이란?
// 최대값이나 최소값을 찾아내는 연산을 빠르게 하기위해 고안된 연산 방법

// 최소 힙
// 작은 값을 항상 루트에 오게 한다.
// 부모 노드가 자식 노드보다 작은 값

// 최대 힙
// 가장 큰 값이 항상 루트에 오게 한다.
// 부모 노드가 자식 노드보다 큰 값

import java.util.Scanner;

// 병합 정렬보단 아니다.
public class BinaryHeaps {

    // 두 요소의 위치를 교환하는 메서드
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    // 힙을 구성하는 메서드
    static void downHeap(int[] a, int left, int right) {
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

    // 힙 정렬을 수행하는 메서드
    static void heapSort(int[] a, int n) {
        // 초기 힙을 구성
        for (int i = (n - 1) / 2; i >= 0; i--) {
            downHeap(a, i, n - 1);
        }

        // 힙 정렬
        for (int i = n - 1; i > 0; i--) {
            // 최대값인 루트와 마지막 요소를 교환
            swap(a, 0, i);
            // 힙을 재구성
            downHeap(a, 0, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        System.out.println("요소를 입력하세요:");
        for (int i = 0; i < nx; i++) {
            x[i] = sc.nextInt();
        }

        heapSort(x, nx); // 배열 x를 정렬한다.

        System.out.println("오름차순으로 정렬합니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}


