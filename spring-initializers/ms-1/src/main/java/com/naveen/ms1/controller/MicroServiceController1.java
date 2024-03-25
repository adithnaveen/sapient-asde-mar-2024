package com.naveen.ms1.controller;

import com.naveen.ms1.proxy.MicroSerivce2Proxy;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MicroServiceController1 {

    @Autowired
    MicroSerivce2Proxy proxy;


    @GetMapping("/")
    public String up() {
        return "MS1 Up";
    }
    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable String name) {
        return "MS1 : says Hi to "+ name;
    }

    private Logger logger = LoggerFactory.getLogger(MicroServiceController1.class);

    @GetMapping("/hi2/{name}")
    @Retry(name = "hi-service", fallbackMethod = "myFallBackMethod")
    public String sayHiFromMS2(@PathVariable String name) {
        logger.info("**** called h2 service with Name {} " , name);
        return proxy.getNameFromMS2(name);
    }

    public String myFallBackMethod(Exception ex){
        logger.debug("Exception {} ", ex.getMessage());
        return "Please wait service will up shortly";
    }
}
