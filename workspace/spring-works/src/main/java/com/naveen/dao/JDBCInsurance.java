package com.naveen.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class JDBCInsurance implements  IInsuranceDAO{

    @Autowired
    SomeService ss;
    /*
        SomeServie ss = new SomeService();
        ss.setxxx ();
        // and keep in it spring container
     */
    public JDBCInsurance() {
        System.out.println("jdbcInsurance instantiated...");
    }

    @Override
    public int count() {
        ss.service();
        return 100;
    }


    public void init() {
        System.out.println("init method called from JDBC");
    }

    public void destroy() {
        System.out.println("destroy method called from JDBC");
    }


}
