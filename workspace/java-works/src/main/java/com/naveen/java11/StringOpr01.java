package com.naveen.java11;

import java.util.List;
import java.util.function.Function;

class MyEmp {}
public class StringOpr01 {
    public static void main(String[] args) {
        int x = 10;
        String name = "siddharth";

        var xx = 100;
        var name1="siddharth1";
        var myemp = new MyEmp();

        // does not work as type mismatch
//        xx = "Hello";

        System.out.println(name1);

        var value = "Hello";

        String repeatString = value.repeat(5);

        System.out.println(repeatString);

        var v1 ="";
        var words="welcome\ntoday\nfor\nlearning\njava11";

        System.out.println(words);

        System.out.println("------------------------");



            words
                .lines()
                .filter((temp) -> temp.length()>3)
                .map((temp) -> temp.toUpperCase())
                .forEach(System.out :: println);

//  creating array dynamically

        List<String> wordsList = List.of("Hi", "bye", "cya", "today");

        String[] array1 = wordsList.toArray(new String[4]);
        print(array1);

        String[] array2 = wordsList.toArray(String[]::new);
        print(array2);

    }

    private static void print(String[] array1) {
        for (String tt : array1) {
            System.out.println(tt);
        }
    }
}
