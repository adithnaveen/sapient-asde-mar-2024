package com.naveen.restfulworks.repo;


import com.naveen.restfulworks.beans.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

// this interface shall have all the references to CRUD +
// custom queries if needed
public interface EmployeeRepo extends MongoRepository<Employee, Integer> {

    // CRUD operations are given by mongoRepository

    // if i want to select employee by name - empName
    public List<Employee> findByEmpName(String empName);

    // to find employees earning more than 10000 as salary
    @Query("{'empSal':{$gt:?0}}")
    public List<Employee> findByEmpSalaryGreaterThan(double empSal);
}
