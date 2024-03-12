package com.sapient.contracts;

import com.sapient.beans.Employee;

import java.util.List;

public interface IEmployeeService {


    public Employee insertEmployee(Employee employee);

    public Employee getEmployee(int employeeId);

    public List<Employee> getEmployees ();

    public void deleteEmployee(int employeeId);

    public Employee updateEmployeeSalary(int employeeId, double empSal);

}
