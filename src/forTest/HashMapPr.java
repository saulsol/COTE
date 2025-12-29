package forTest;

import java.util.HashMap;

public class HashMapPr {
    public static void main(String[] args) {

        HashMap <String, Integer> nameList = new HashMap<>();
        nameList.put("James", 10);
        nameList.put("Garner", 20);

        System.out.println(nameList.get("James"));

    }
}
