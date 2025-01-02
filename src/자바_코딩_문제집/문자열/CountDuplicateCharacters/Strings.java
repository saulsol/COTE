package 자바_코딩_문제집.문자열.CountDuplicateCharacters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Strings {
    private Strings() {
        throw new AssertionError("초기화 X");
    }

    // 1. 문자열 내 문자를 순회하며 Map을 사용해 문자를 키로, 빈도수를 값으로 저장하는 방법

    public static Map<Character, Integer> countDuplicateCharacterVO(String str){

        if(str == null || str.isBlank()){
            return Collections.emptyMap();
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        return map;
    }

    public static Map<Character, Integer> countDuplicateCharacterV1(String str){

        if(str == null || str.isBlank()){
            return Collections.emptyMap();
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.compute(
                    ch, ((key, value) -> (value == null) ? 1 : ++value)
            );
        }

        return map;
    }








}
