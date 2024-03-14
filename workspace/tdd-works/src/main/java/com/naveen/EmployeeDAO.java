package com.naveen;

public class EmployeeDAO implements  IEmployeeDAO {

    @Override
    public String insertEmployee(int empId, String empName) {
        return "Inserted From Class";
    }
}
