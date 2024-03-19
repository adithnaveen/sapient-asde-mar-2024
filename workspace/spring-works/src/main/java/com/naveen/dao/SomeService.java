package com.naveen.dao;

import org.springframework.stereotype.Component;

@Component
public class SomeService {
    public SomeService() {
        System.out.println("Some Service is called.. ");
    }

    public void service() {
        System.out.println("**** Some Service invoked.. ");
    }
}
