package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = i -> i % 2 == 0;

    static Predicate<Integer> p2 = i -> i % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Result in predicateAnd : " + p1.and(p2).test(6));
    }

    public static void predicateOr() {
        System.out.println("Result in predicateOr : " + p1.or(p2).test(4));
    }

    public static void predicateNegate() {
        //equivalent to reversing the result
        // initial result of ".and" should be false, but negate will reverse it to true
        System.out.println("Result in predicateNegate : " + p1.and(p2).negate().test(4));
    }

    public static void main(String[] args) {

        System.out.println("Result is p1 : " + p1.test(3));

        predicateAnd();

        predicateOr();

        predicateNegate();

        List<Student> students = StudentDataBase.getAllStudents();
        boolean flag = students.stream()
                .anyMatch(student -> student.getActivities().contains("ping-pong"));
        System.out.println(flag);
    }
}
