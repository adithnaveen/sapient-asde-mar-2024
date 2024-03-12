package com.naveen.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// working with lambdas
public class LambaEx01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Siddhart", "Ayan", "Aman", "Neha", "Kumar");

        // want to see various ways of iteration

        // old way

        System.out.println("with normal for loop...");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }

        System.out.println("Itration with iterator ");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() +"\t");
        }


        System.out.println("for with implicit iterator ");
        for(String temp : list) {
            System.out.print(temp +"\t");
        }

        // java 8
        // with consumer as class

        System.out.println("\n with consumer ");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s  + "\t");
            }
        });

        // with lamba


        System.out.println("\n with lambda  ");
        list.forEach((s) ->  System.out.print(s  + "\t"));


        // method reference
        System.out.println("\n with method reference ");
        list.forEach(System.out :: println);
    }
}
