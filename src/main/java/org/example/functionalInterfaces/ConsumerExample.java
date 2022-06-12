package org.example.functionalInterfaces;

import org.example.data.Student;

import java.util.List;
import java.util.function.Consumer;

import static org.example.data.StudentDataBase.getAllStudents;

public class ConsumerExample {

    public static void printStudents() {
        List<Student> studentList = getAllStudents();
        studentList.forEach(System.out::println);
    }

    public static void printNameAndActivities() {
        Consumer<Student> c1 = s -> System.out.print(s.getName());
        Consumer<Student> c2 = s -> System.out.println(s.getActivities());
        List<Student> studentList = getAllStudents();
        studentList.forEach(c1.andThen(c2));
    }

    public static void printNameUsingCondition() {
        List<Student> studentList = getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel() > 3)
                System.out.println(student.getName());
        });
    }

    public static void main(String[] args) {

        // prints all students
        printStudents();
        System.out.println();
        // prints students' name & activities
        printNameAndActivities();
        System.out.println();
        // prints students' name where gradeLevel > 3
        printNameUsingCondition();

    }
}
