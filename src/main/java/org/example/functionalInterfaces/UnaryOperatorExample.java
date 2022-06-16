package org.example.functionalInterfaces;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        /**
         * In this example, the Function<Integer, Integer> which accepts and returns the same type,
         * can be replaced with UnaryOperator<Integer> or IntBinaryOperator.
         */
        Function<Integer, Integer> functionalInterfaces = number -> number * 2;
        Integer result = functionalInterfaces.apply(4);
        System.out.println(result);

        //replacing
        UnaryOperator<Integer> unaryOperator = number -> number * 2;
        Integer result2 = unaryOperator.apply(4);
        System.out.println(result2);

        IntUnaryOperator intUnaryOperator = number -> number * 2;
        Integer result3 = intUnaryOperator.applyAsInt(4);
        System.out.println(result3);


    }
}
