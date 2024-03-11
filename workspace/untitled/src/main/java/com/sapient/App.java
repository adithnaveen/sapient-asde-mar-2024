package com.sapient;

import com.sapient.beans.Employee;
import com.sapient.contracts.IEmployeeDAO;
import com.sapient.dao.EmployeeDAO;



public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee(101, "Naveen", 12345);

        IEmployeeDAO dao = new EmployeeDAO();
        Employee insertedEmployee = dao.insertEmployee(employee);

        System.out.println(insertedEmployee);


    }
}
