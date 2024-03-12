package com.naveen.classworks;

import java.util.Set;
import java.util.TreeSet;

public class SetEx04 {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        set.add(new Employee(101, "sifat", 11223));
        set.add(new Employee(101, "sifat", 11223));
        set.add(new Employee(102, "Neha", 22113));


        System.out.println(set);

    }
}
