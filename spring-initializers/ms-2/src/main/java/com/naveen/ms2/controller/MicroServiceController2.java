package com.naveen.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MicroServiceController2 {


    @GetMapping("/")
    public String up() {
        return "MS2 Up";
    }
    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable String name) {
        return "MS2 : SAYS HI TO "+ name;
    }
}
