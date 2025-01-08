package programmers;

import java.util.Arrays;
import java.util.Collections;

// 정수 배열을 하나 받은 다음 배열의 중복값을 제거하고 배열 데이터를 내림 차순으로 정렬해서 반환하는 solution()을 제작
public class Solution {
    private int [] solution(int [] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
