package com.naveen.classworks;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Aman");
        mySet.add("Ajit");
        mySet.add("Anil");
        mySet.add("Aman");

        System.out.println(mySet);

        for(String temp : mySet) {
            System.out.println(temp.hashCode() +", " + temp);
        }

    }
}
