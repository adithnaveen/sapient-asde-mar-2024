package com.sapient.exception;

public class EmployeeNotFoundException extends  RuntimeException{

    private String message;

    public EmployeeNotFoundException () {
        this.message = "Employee which you are searching is not found";
    }

    public EmployeeNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Sorry Employee Not Found " + this.message;
    }


    @Override
    public String toString() {
        return "EmployeeNotFoundException{" +
                "message='" + message + '\'' +
                '}';
    }
}
