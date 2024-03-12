package com.naveen.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaSortEx03 {
    public static void main(String[] args) {
        List<Employee> listEmployee = Arrays.asList(
                new Employee(101, "Paras", "Delhi", 10000),
                new Employee(44, "Neha", "Mumbai", 10000),
                new Employee(123, "Rajesh", "Delhi", 12000),
                new Employee(55, "Dhananjay", "Mumbai", 20000),
                new Employee(77, "Aman", "Bengaluru", 30000)
        );

        listEmployee.forEach((emp) -> System.out.println(emp));


        // sorting funcationality

        Comparator<Employee> ascendingOrderName = (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName());
        Comparator<Employee> descendingOrderName = ascendingOrderName.reversed();


        listEmployee.sort(ascendingOrderName);

        print("Sort on ascending of Name ", listEmployee);

        listEmployee.sort(descendingOrderName);

        print("Sort on descending of Name ", listEmployee);

        // ascending of location + descending of salary

        Comparator<Employee> ascendingLocation =
                (e1, e2) -> e1.getLocation().compareTo(e2.getLocation());

        Comparator<Employee> descendingSalary =
                (e1, e2) -> (int) (e2.getSalary() - e1.getSalary());


        Comparator<Employee> ascLocDescSalary = ascendingLocation.thenComparing(descendingSalary);

        listEmployee.sort(ascLocDescSalary);


        print("Sort on ascLocDescSalary", listEmployee);


    }

    private static void print(String title, List<Employee> listEmployee) {
        System.out.println(title);
        listEmployee.forEach((temp) -> System.out.println(temp));
    }
}
