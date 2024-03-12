package com.naveen.exception;

public class InsuranceDetailsNotValidException extends RuntimeException{

    private String message;

    // create constructors as needed


    @Override
    public String toString() {
        return "InsuranceDetailsNotValidException{" +
                "message='" + message + '\'' +
                '}';
    }
}
