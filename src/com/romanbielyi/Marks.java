package com.romanbielyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Marks {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input = Integer.parseInt(reader.readLine());
            String result = switch (input) {
                case 9, 10 -> "Well";
                case 7, 8 -> "Good";
                case 6 -> "Acceptable";
                case 5 -> "Bad";
                case 0, 1, 2, 3, 4 -> "Very bad";
                default -> throw new Exception("bad range, the valid range is 0-10");
            };
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
