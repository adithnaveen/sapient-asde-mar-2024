package com.sapient;

import com.sapient.beans.Employee;
import com.sapient.contracts.IEmployeeDAO;
import com.sapient.dao.EmployeeDAO;

import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        Employee employee = new Employee(103, "Yogesh", 33221);

        IEmployeeDAO dao = new EmployeeDAO();
//        Employee insertedEmployee = dao.insertEmployee(employee);
//        System.out.println(insertedEmployee);
//        dao.deleteEmployee(101);
//
//        Employee employee1 = dao.getEmployee(101);
//
//        System.out.println(employee1);


        // get all records

        List<Employee> employees = dao.getEmployees();

        for(Employee temp : employees) {
            System.out.println(temp);
        }
    }
}
