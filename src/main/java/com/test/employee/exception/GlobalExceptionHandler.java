package com.test.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler{
    @ExceptionHandler
    
    public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeNotFoundException e,WebRequest we){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
    }
}
