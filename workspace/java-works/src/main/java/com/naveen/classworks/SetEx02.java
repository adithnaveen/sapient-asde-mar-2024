package com.naveen.classworks;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee(101, "sifat", 11223));
        set.add(new Employee(101, "sifat", 11223));
        set.add(new Employee(102, "Neha", 22113));

        for(Employee temp : set) {
            System.out.println(temp +", " + temp.hashCode());
        }


    }
}
