package com.naveen.ms1.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MICROSERVICE-2")
public interface MicroSerivce2Proxy {

    @GetMapping("/api/hi/{name}")
    public String getNameFromMS2( @PathVariable String name);
}
