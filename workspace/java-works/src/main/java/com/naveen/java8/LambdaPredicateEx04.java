package com.naveen.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaPredicateEx04 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 32, -33, 0, -100, 45);

        list.forEach(val -> System.out.println(val));


        Predicate<Integer> positiveNumbersPredicate = (val) -> val > 0;

        List<Integer> positiveList = list.stream().
                filter(positiveNumbersPredicate).toList();

        System.out.println("only positive values ");
        positiveList.forEach(System.out :: println);



        // supplier example

        Supplier<Integer> integerSupplier = new Supplier<>() {

            @Override
            public Integer get() {
                return 10;
            }
        };

        Supplier<Integer> integerSupplier1 = () -> 10;
    }
}
