package com.naveen.restfulworks.exception;

public class EmployeeNotFoundException extends  RuntimeException{
    private String msg;
    public EmployeeNotFoundException(String msg) {
        this.msg = msg;
    }
    public EmployeeNotFoundException() {
        this.msg = "Sorry Object Not Found";
    }
    @Override
    public String getMessage() {
        return "Employee Not Found : " + this.msg;
    }
}
