package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int[] getSortedEvenNumbers(String s) {

        if (s == null || s.isEmpty()) {
            System.out.println("String must contain numbers/not be null for this task. Empty array will be returned.");
            return new int[0];
        }

            ArrayList<Integer> numbers = new ArrayList<>();

            for (String element : s.split(";")) {
                Integer integer = Integer.valueOf(element);
                if (integer % 2 == 0) {
                    numbers.add(integer);
                }
            }

            int[] nums = new int[numbers.size()];

            for (int i = 0; i < numbers.size(); i++) {
                nums[i] = numbers.get(i);
            }

            Arrays.sort(nums);

            return nums;
    }

    public static int[] getSortedEvenNumbers2(String s) {

        if (s == null || s.isEmpty()) {
            System.out.println("String must contain numbers/not be null for this task. Empty array will be returned.");
            return new int[0];
        }

        return Arrays.stream(s.split(";"))
                .mapToInt(Integer::parseInt)
                .filter((i) -> i % 2 == 0)
                .sorted()
                .toArray();
    }

}
