package com.naveen.java11;

public class AppInsuranceTest {
    public static void main(String[] args) {

        Insurance i = new
                Insurance(101, "Child Care Plan", 234);


        System.out.println("insurance Id " + i.insuranceId());

        System.out.println(i);
        i.setInsuranceTitle("hi");


    }
}
