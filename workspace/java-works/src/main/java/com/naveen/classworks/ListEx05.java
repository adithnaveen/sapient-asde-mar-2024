package com.naveen.classworks;


import java.util.ArrayList;
import java.util.List;

// to show working with list + custom object
public class ListEx05 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        // this is old style store
        list.add(new Employee(101, "Sifat", 12345));
        list.add(new Employee(102, "Neha", 22112));
        list.add(new Employee(103, "Ayusha", 33221));
        list.add(new Employee(101, "Sifat", 12345));
        list.add(new Employee(102, "Neha", 22112));
        list.add(new Employee(103, "Ayusha", 33221));

        // iteration
        for(Employee temp : list) {
            System.out.println(temp);
        }
        List<Employee> employeeList = List.of(
                new Employee(101, "SIFAT", 12345),
                new Employee(102, "NEHA", 22112),
                new Employee(103, "AYUSHA", 33221),
                new Employee(101, "SIFAT", 12345),
                new Employee(102, "NEHA", 22112),
                new Employee(103, "AYUSHA", 33221)
        );
        System.out.println("---------------------------------------");

        for(Employee temp : employeeList) {
            System.out.println(temp);
        }


    }
}
