package org.example.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> functionToLowerCase = String::toLowerCase;
    static Function<String, String> functionConcat = input -> input.concat(" default concat");
    static Function<String, Integer> strLength = String::length;

    public static String performConcat(String str) {
        return FunctionExample.functionConcat.apply(str);
    }

    public static void main(String[] args) {

        System.out.println(functionToLowerCase.apply("TEST"));
        System.out.println(functionToLowerCase.andThen(functionConcat).apply("TEST"));
        System.out.println(strLength.apply("test"));

        System.out.println(performConcat("STRING"));

    }
}
