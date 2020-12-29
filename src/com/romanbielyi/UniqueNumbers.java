package com.romanbielyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            String[] parsedInput = input.split(", ");
            for (String s : parsedInput) {
                try {
                    nums.add(Integer.parseInt(s));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Object res = nums
                    .stream()
                    .collect(Collectors.teeing(
                            Collectors.counting(),
                            Collectors.toSet(),
                            (n, uniqueNum) -> ((float) uniqueNum.size() / n * 100)));
            System.out.println(res + "%");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
