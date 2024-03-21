package com.naveen.restfulworks.controller;

import com.naveen.restfulworks.beans.Employee;
import com.naveen.restfulworks.contracts.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    IEmployeeService service;


    @GetMapping("/")
    public String serviceUp() {
        return "up";
    }

    @PostMapping("/employee")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status
                (HttpStatus.CREATED).
                body(service.save(employee));
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return service.getEmps();
    }
    @GetMapping("/employee/{empId}")
    public Employee getEmployeeById(@PathVariable
                                         Integer empId) {
        return service.getEmp(empId);
    }
}
