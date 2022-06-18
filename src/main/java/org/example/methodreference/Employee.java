package org.example.methodreference;

public class Employee {

    private int age;
    private String department;

    public Employee() {
    }

    public Employee(int age, String department) {
        this.age = age;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
