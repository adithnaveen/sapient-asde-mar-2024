package com.naveen.classworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListEx03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        String value = null;
        do{
            System.out.println("Enter Name: ");
             value  = br.readLine();
             list.add(value);
        }while (!value.equals("stop"));


        System.out.println("Enterd values are ");
        System.out.println(list);
    }
}
