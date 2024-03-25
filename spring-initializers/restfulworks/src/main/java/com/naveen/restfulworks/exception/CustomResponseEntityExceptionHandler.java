package com.naveen.restfulworks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Object> employeeNotFoundException
                (Exception exception, WebRequest request) {

        exception.printStackTrace(); // this is for developer
        var response = new ExceptionResponse();
        response.setDate(new Date());
        response.setMessage(exception.getMessage());
        response.setDetails(request.getDescription(false));


        return new ResponseEntity<Object>(response,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

@ExceptionHandler(Exception.class)
public ResponseEntity<Object> handleAllException(Exception exception, WebRequest request) {

    exception.printStackTrace(); // this is for developer
    var response = new ExceptionResponse();
    response.setDate(new Date());
    response.setMessage(exception.getMessage());
    response.setDetails(request.getDescription(false));


    return new ResponseEntity<Object>(response,
            HttpStatus.INTERNAL_SERVER_ERROR);
}
}
