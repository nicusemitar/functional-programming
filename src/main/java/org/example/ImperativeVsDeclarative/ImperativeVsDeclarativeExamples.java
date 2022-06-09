package org.example.ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExamples {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 5, 5};

        /**
         * Imperative Style - how style of programming
         */
        returnSum(arr);

        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */
        int sum = IntStream.of(arr)
                .sum();
        System.out.println(sum);


        //Example 2
        /**
         * Imperative Style
         */
        returnDistinct(arr);

        /**
         * Declarative Style
         */
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 5, 5);
        List<Integer> uniqueList = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueList);
    }

    // sum of the elements in an int array and return the result as a long
    public static long returnSum(int[] arr) {
        long sum = 0;
        for (int number : arr) {
            sum = sum + number;
        }
        System.out.println(sum);
        return sum;
    }

    // putting just distinct elements in an int array
    public static void returnDistinct(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int number : arr) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        System.out.println(uniqueList);
    }
}
