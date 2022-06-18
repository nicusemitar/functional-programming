package org.example.methodreference;

import java.util.function.BiFunction;

public class ConstructorReferenceExample {
    public static void main(String[] args) {

        BiFunction<Integer, String, Employee> biFunction = (age, department) -> new Employee(age, department);
        Employee employee = biFunction.apply(24, "Java");
        System.out.println(employee);

        //or using Constructor Reference
        BiFunction<Integer, String, Employee> biFunction1 = Employee::new;
        Employee employee1 = biFunction1.apply(25, "NodeJS");
        System.out.println(employee1);

    }
}
