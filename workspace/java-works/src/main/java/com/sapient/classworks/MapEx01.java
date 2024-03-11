package com.sapient.classworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx01 {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();

        map.put("kumar", new Employee(101, "Naveen Kumar", 12345));
        map.put("harish", new Employee(102, "Harish Chandra", 23221));
        map.put("prakash", new Employee(103, "Prakash Padukone", 78789));
        map.put("vedant", new Employee(104, "Vedant", 99887));

        Iterator<Map.Entry<String, Employee>> iterator = map.entrySet().iterator();
        
        while(iterator.hasNext()) {
            Iterator<Map.Entry<String, Employee>> iterator1 = iterator;
            Map.Entry<String, Employee> emp = iterator1.next();

            System.out.println("Key " + emp.getKey() + "\t " +  emp.getValue());

        }
        

    }
}
