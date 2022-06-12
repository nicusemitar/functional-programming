package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {

        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) ->
                System.out.println(name + " : " + activities);

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(s -> studentBiConsumer.accept(s.getName(), s.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumerSum = (a, b) ->
                System.out.println(a + b);

        BiConsumer<Integer, Integer> biConsumerDivide = (a, b) ->
                System.out.println(a / b);

        BiConsumer<Integer, Integer> biConsumerMultiply = (a, b) ->
                System.out.println(a * b);

        biConsumerMultiply.accept(10, 10);
        //consumer chaining
        biConsumerSum.andThen(biConsumerDivide).andThen(biConsumerMultiply).accept(3, 3);

        nameAndActivities();
    }
}
