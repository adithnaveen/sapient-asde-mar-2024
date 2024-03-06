package com.sapient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
    public static void main(String[] args) {
        logger.info("Hello from info ... ");
        logger.debug("Hello from debug... ");
        logger.error("Hello from  error... ");

        String name = "Training ASDE Batch Blr ";
        logger.info("value substitution {}", name);


    }
}
