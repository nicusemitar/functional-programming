package org.example.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * Without Lambda Syntax
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 2");
            }
        }).start();

        /**
         * Lambda Syntax
         * ()->{}
         * assigning a lambda to a variable
         */

        Runnable runnableLambdaSimple = () ->
                System.out.println("Inside Runnable 3");

        Runnable runnableLambdaMultiStatements = () -> {
            System.out.println("Inside Runnable 4");
            System.out.println("Inside Runnable 4");
        };

        new Thread(runnableLambdaSimple).start();
        new Thread(runnableLambdaMultiStatements).start();

        new Thread(() ->
                System.out.println("Inside Runnable 5")).start();
    }
}