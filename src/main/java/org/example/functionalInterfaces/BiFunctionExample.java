package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {


    static BiFunction<List<Student>, Predicate<Student>, Map<String, Integer>> biFunction = (students, studentPredicate)->{

        Map<String,Integer> studentGradeMap = new HashMap<>();
        students.forEach((student -> {

            if(studentPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGradeLevel());
            }
        }));

        return studentGradeMap;

    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateAndConsumerExample.P2));

    }
}
