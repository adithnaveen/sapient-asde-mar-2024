package com.naveen.restfulworks.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.MongoId;

public record Employee
        (

                @MongoId
                int empId,
         String empName,
         double empSalary,
         String empEmail) {
}
