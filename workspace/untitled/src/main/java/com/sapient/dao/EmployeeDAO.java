package com.sapient.dao;

import com.sapient.beans.Employee;
import com.sapient.connection.GetConnection;
import com.sapient.contracts.IEmployeeDAO;
import com.sapient.exception.EmployeeNotFoundException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        String sql = "select empname, empsal from employee where empid=?";

        try {
            PreparedStatement preparedStatement = GetConnection.getMysqlConnection().prepareStatement(sql);

            preparedStatement.setInt(1, employeeId);

            ResultSet rs =  preparedStatement.executeQuery();

            if(rs.next()){
                Employee emp = new Employee();
                emp.setEmpId(employeeId);
                emp.setEmpName(rs.getString("empname"));
                emp.setEmpSal( rs.getDouble("empsal"));

                return emp;

            }

           throw new EmployeeNotFoundException("Sorry Employee Id " + employeeId + " not found");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public List<Employee> getEmployees() {

        String sql ="select empid, empname, empsal from employee";
        List<Employee> list = new ArrayList<>();

        try {
            PreparedStatement preparedStatement =
                    GetConnection.getMysqlConnection().prepareStatement(sql);


            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Employee emp = new Employee();
                emp.setEmpId(resultSet.getInt("empid"));
                emp.setEmpName(resultSet.getString("empname"));
                emp.setEmpSal( resultSet.getDouble("empsal"));

                list.add(emp);
            }
            return list;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteEmployee(int employeeId) {
        String sql ="delete from employee where empid=?";
        try {
            PreparedStatement preparedStatement = GetConnection.getMysqlConnection().
                    prepareStatement(sql);

            preparedStatement.setInt(1, employeeId);

            String status = preparedStatement.executeUpdate()>0 ? "Delete" :"Not Deleted";
            System.out.println(status);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO
    @Override
    public Employee updateEmployeeSalary(int employeeId, double empSal) {
        return null;
    }
}
