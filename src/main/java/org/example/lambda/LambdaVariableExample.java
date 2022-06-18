package org.example.lambda;

import java.util.function.IntConsumer;

public class LambdaVariableExample {

    static int value = 4;

    public static void main(String[] args) {

        /*
        Can not to use the same local variable name as lambda parameters or inside the lambda body
        int start = 1;
        Consumer<Integer> integerConsumer = start -> System.out.println(start);
         */
        IntConsumer integerConsumer = c1 ->
                System.out.println(value + c1);
        integerConsumer.accept(4);

        /**
         * Effectively Final in Lambda
         */
        int number = 4;
        IntConsumer integerConsumer1 = a ->
                //number = 5; reassigning not allowed
                System.out.println(a + number);
        integerConsumer1.accept(1);
    }
}
