package org.example.functionalInterfaces;

import org.example.data.Student;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import static org.example.data.StudentDataBase.getAllStudents;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Integer>> listMapFunction =
            listOfStudents -> {
                Map<String, Integer> map = new TreeMap<>();
                listOfStudents.stream()
                        .filter(student -> student.getGradeLevel() >= 3)
                        .forEach(student -> map.put(student.getName(), student.getGradeLevel()));
                return map;
            };

    public static void main(String[] args) {

        List<Student> studentList = getAllStudents();
        System.out.println(listMapFunction.apply(studentList));

    }
}
