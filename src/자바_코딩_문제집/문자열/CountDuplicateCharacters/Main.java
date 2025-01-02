package 자바_코딩_문제집.문자열.CountDuplicateCharacters;

import java.util.Arrays;
import java.util.Map;

public class Main {

    private static final String TEXT = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";
    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");

        Map<Character, Integer> characterIntegerMapV0 = Strings.countDuplicateCharacterVO(TEXT);
        System.out.println(Arrays.toString(characterIntegerMapV0.entrySet().toArray()));


        Map<Character, Integer> characterIntegerMapV1 = Strings.countDuplicateCharacterV1(TEXT);
        System.out.println(Arrays.toString(characterIntegerMapV1.entrySet().toArray()));



    }
}
