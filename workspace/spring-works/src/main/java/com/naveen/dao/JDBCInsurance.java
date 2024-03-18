package com.naveen.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class JDBCInsurance implements  IInsuranceDAO{

    public JDBCInsurance() {
        System.out.println("jdbcInsurance instantiated...");
    }

    @Override
    public int count() {
        return 100;
    }


    public void init() {
        System.out.println("init method called from JDBC");
    }

    public void destroy() {
        System.out.println("destroy method called from JDBC");
    }


}
