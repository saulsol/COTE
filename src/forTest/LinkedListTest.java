package forTest;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        // -- 원소 추가 O(1)
        deque.addFirst(10); // 왼쪽 끝에 추가 [10]
        deque.addLast(20);  // 오른쪽 끝에 추가 [20]
        
        
        // -- 원소 조회(O(1), 제거하지 않음)

        deque.add(15);
        deque.add(25);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);
    }
}
