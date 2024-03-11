package com.sapient.dao;

import com.sapient.beans.Employee;
import com.sapient.connection.GetConnection;
import com.sapient.contracts.IEmployeeDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO  implements IEmployeeDAO {

    @Override
    public Employee insertEmployee(Employee employee) {

        // the positional paramenters in this query shall start values from 1
        String sql ="insert into employee values(?,?,?)";

        try {
            PreparedStatement preparedStatement =
                        GetConnection.getMysqlConnection().prepareStatement(sql);

            preparedStatement.setInt(1, employee.getEmpId());
            preparedStatement.setString(2, employee.getEmpName());
            preparedStatement.setDouble(3, employee.getEmpSal());


             return preparedStatement.executeUpdate()> 0 ? employee : null;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public Employee getEmployee(int employeeId) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public void deleteEmployee(int employeeId) {

    }

    @Override
    public Employee updateEmployeeSalary(int employeeId, double empSal) {
        return null;
    }
}
