package com.naveen.classworks;


// this is a bean class
// you can class being encapusulated
// which has got private variable + public getters and setter
// if you want you can have parametric constructors
public class Employee implements  Comparable<Employee>{
    private int empId;
    private String  empName;
    private double empSal;

    public Employee() {
    }

    public Employee(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    // we have boiler plate code, java 14 introduced records

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }


    @Override
    public int hashCode() {
        return this.empName.charAt(0);
    }


    @Override
    public boolean equals(Object obj) {
        Employee temp = (Employee) obj;
        return
                this.empId == temp.empId &&
                this.empName.equals(temp.empName) &&
                this.empSal == temp.empSal;

    }

    @Override
    public int compareTo(Employee o) {
//        return o.empName.compareTo(this.getEmpName());
        return (int) (this.empSal - o.getEmpSal());
    }

}
