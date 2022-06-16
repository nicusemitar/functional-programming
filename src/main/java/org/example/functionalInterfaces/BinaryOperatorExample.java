package org.example.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        /**
         * In this example, the BiFunction<Integer, Integer, Integer> which accepts and returns the same type,
         * can be replaced with BinaryOperator<Integer>.
         */
        // BiFunction
        BiFunction<Integer, Integer, Integer> biFunction = (x1, x2) -> x1 + x2;
        Integer result = biFunction.apply(2, 3);
        System.out.println(result);

        // replacing BinaryOperator
        BinaryOperator<Integer> binaryOperator = (x1, x2) -> x1 + x2;
        Integer result2 = binaryOperator.apply(2, 3);
        System.out.println(result2);

        // replacing IntBinaryOperator
        IntBinaryOperator integerBinaryOperator = (x1, x2) -> x1 + x2;
        Integer result3 = integerBinaryOperator.applyAsInt(2, 3);
        System.out.println(result3);

    }
}
