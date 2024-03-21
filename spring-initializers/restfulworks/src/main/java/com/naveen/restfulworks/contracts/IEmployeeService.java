package com.naveen.restfulworks.contracts;

import com.naveen.restfulworks.beans.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IEmployeeService {
    public Employee save(Employee employee);

    public List<Employee> getEmps();

    public Employee getEmp(int empId);
}
