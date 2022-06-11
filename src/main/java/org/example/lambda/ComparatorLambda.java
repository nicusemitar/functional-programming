package org.example.lambda;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {

        /**
         * Without Lambda Syntax
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // 0 -> o1 == o2
                // 1 -> o1 > o2
                // -1 -> o1 < o2
            }
        };
        System.out.println(comparator.compare(1, 3));

        /**
         * Lambda Syntax
         */

        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        //or
        Comparator<Integer> comparatorLambda1 = Integer::compareTo;

        System.out.println(comparatorLambda.compare(3, 1));
        System.out.println(comparatorLambda1.compare(3, 1));

    }
}
