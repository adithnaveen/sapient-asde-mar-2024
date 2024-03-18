package com.naveen.dao;

public class DummyInsurance implements  IInsuranceDAO{


    public DummyInsurance() {
        System.out.println("Dummy Insurance Instantiated...");
    }

    @Override
    public int count() {
        return 0;
    }
}
