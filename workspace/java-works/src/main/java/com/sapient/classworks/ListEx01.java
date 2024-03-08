package com.sapient.classworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx01 {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();

        mylist.add(10);
        mylist.add("Hello");
        mylist.add(true);
        mylist.add(new Object());

        Iterator iterator = mylist.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
