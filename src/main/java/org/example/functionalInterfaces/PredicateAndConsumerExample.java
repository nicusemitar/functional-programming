package org.example.functionalInterfaces;

import org.example.data.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.example.data.StudentDataBase.getAllStudents;

public class PredicateAndConsumerExample {

    private static final String FEMALE = "female";

    static final Predicate<Student> P1 = student -> student.getGradeLevel() > 3;
    static final Predicate<Student> P2 = student -> student.getGender().equals(FEMALE);

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) ->
            System.out.println(name + "-" + activities);

    Consumer<Student> studentConsumer = student -> {
        if (P1.and(P2).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void main(String[] args) {

        List<Student> studentList = getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);

        //first approach
        studentList.stream()
                .filter(((Predicate<Student>) student -> student.getGradeLevel() > 3)
                        .and(student -> student.getGender().equals(FEMALE)))
                .collect(Collectors.toList()).
                forEach(student -> System.out.println(student.getName() + "-" + student.getActivities()));

        //second approach
        studentList.stream()
                .filter(student -> student.getGradeLevel() > 3
                        && student.getGender().equals(FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

}
