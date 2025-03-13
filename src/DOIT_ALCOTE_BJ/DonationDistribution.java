package DOIT_ALCOTE_BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DonationDistribution {
    public static void main(String[] args) {
        int people = 9;
        int amount = 22000;

        Map<Integer, Integer> result = distributeDonations(people, amount);

        if (result == null) {
            System.out.println("배분 불가능");
        } else {
            System.out.println("1000원: " + result.getOrDefault(1000, 0) + "명");
            System.out.println("5000원: " + result.getOrDefault(5000, 0) + "명");
            System.out.println("10000원: " + result.getOrDefault(10000, 0) + "명");
        }
    }

    public static Map<Integer, Integer> distributeDonations(int people, int amount) {
        for (int ten = 0; ten <= people; ten++) {
            for (int five = 0; five <= people - ten; five++) {
                int one = people - ten - five;
                int total = ten * 10000 + five * 5000 + one * 1000;

                if (total == amount) {
                    Map<Integer, Integer> distribution = new HashMap<>();
                    distribution.put(10000, ten);
                    distribution.put(5000, five);
                    distribution.put(1000, one);
                    return distribution;
                }
            }
        }
        return null;
    }

}
