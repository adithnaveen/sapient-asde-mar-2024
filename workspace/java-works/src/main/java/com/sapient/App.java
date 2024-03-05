package com.sapient;

import java.util.ArrayList;
import  java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<String> list = new ArrayList<>();

        list.add("Siddharth");
        list.add("Mohit");
        list.add("Paras");
        list.add("Sri hari");

         for(String temp : list) {
             System.out.println(temp);
         }



    }
}
