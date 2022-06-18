package org.example.methodreference;

import org.example.data.Student;

import java.util.List;

import static org.example.data.StudentDataBase.getAllStudents;

public class ConsumerMethodReferenceExample {
    public static void main(String[] args) {

        /**
         * className :: methodName
         */
        List<Student> studentList = getAllStudents();
        studentList.forEach(System.out::println);

        /**
         * case where we can not use Method Reference because the output from the previous expression needs to match
         * the input parameters of the referenced method signature.
         */
        studentList.forEach(s -> System.out.printf("Student name is '%s' and grade level is '%d' \n", s.getName(), s.getGradeLevel()));
        /**
         * the printf method requires 3 parameters in our case, and using studentList().forEach()
         * would only allow the method reference to infer one parameter (the Student object).
         */

    }

}
