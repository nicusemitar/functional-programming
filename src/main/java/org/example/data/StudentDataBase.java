package org.example.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    private StudentDataBase() {
    }

    /**
     * Total of 6 students in the database.
     */
    public static List<Student> getAllStudents() {

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam", 2, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        Student student2 = new Student("Jenny", 2, "female", Arrays.asList("swimming", "gymnastics", "soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily", 3, "female", Arrays.asList("swimming", "gymnastics", "ping-pong"));
        Student student4 = new Student("Dave", 3, "male", Arrays.asList("swimming", "gymnastics", "soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia", 4, "female", Arrays.asList("swimming", "dancing", "football"));
        Student student6 = new Student("James", 4, "male", Arrays.asList("swimming", "basketball", "baseball", "football"));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);

    }
}
