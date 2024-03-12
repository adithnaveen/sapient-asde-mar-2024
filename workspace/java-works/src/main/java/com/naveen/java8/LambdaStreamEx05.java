package com.naveen.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaStreamEx05 {
    public static void main(String[] args) {
        List<Employee> listEmployee = Arrays.asList(
                new Employee(101, "Paras", "Delhi", 3000),
                new Employee(44, "Neha", "Mumbai", 10000),
                new Employee(45, "Harsh", "Delhi", 12345),
                new Employee(123, "Rajesh", "Delhi", 12000),
                new Employee(55, "Dhananjay", "Mumbai", 20000),
                new Employee(77, "Aman", "Bengaluru", 30000)
        );


        // to get sum of salaries of people who live in delhi
        // filter (predicate) + aggregation

        double sumOfSals = listEmployee.stream()
                .filter(emp -> emp.getLocation().equals("Delhi"))
                .filter(emp -> emp.getSalary() > 0)
                .mapToDouble(emp -> emp.getSalary())
                .sum();

        System.out.println(sumOfSals);



    }
}
