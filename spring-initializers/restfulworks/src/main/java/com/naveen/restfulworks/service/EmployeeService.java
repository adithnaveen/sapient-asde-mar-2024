package com.naveen.restfulworks.service;

import com.naveen.restfulworks.beans.Employee;
import com.naveen.restfulworks.contracts.IEmployeeService;
import com.naveen.restfulworks.exception.EmployeeNotFoundException;
import com.naveen.restfulworks.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepo repo;

    @Override
    public Employee save(Employee employee) {
        System.out.println(employee);
       return repo.insert(employee);
    }

    @Override
    public List<Employee> getEmps() {
        return repo.findAll();
    }

    @Override
    public Employee getEmp(int empId) {

        Optional<Employee> byId = repo.findById(empId);
        if(byId.isPresent()) {
            return byId.get();
        }

        throw new EmployeeNotFoundException("Sorry Employee Not Found " + empId);
    }


}
