package com.test.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.employee.model.Employee;
import com.test.employee.service.Employeeservice;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private Employeeservice employeeservice;

    @GetMapping("/all")
    public List <Employee> getAllEmployees(){
        return employeeservice.getAllEmployees();

    }

     @PostMapping("/addEmployee")
     public Employee addEmployee(@RequestBody Employee emp){
          return employeeservice.addEmployee(emp);
     }
}
