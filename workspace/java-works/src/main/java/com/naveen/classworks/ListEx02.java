package com.naveen.classworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx02 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();

        mylist.add("Rajat");
        mylist.add("Price");

        Iterator<String> iterator = mylist.iterator();

//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        for(String temp : mylist) {
            System.out.println(temp);
        }


    }
}
