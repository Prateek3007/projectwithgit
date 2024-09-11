package com.test.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.employee.exception.EmployeeNotFoundException;
import com.test.employee.model.Employee;
import com.test.employee.repository.EmployeeRepository;

@Service
public class Employeeservice {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();

    }
    public Employee getEmployeeById(long Id){
       return employeeRepository.findById(Id).get();
    }
    public Employee addEmployee(Employee emp){
         return employeeRepository.save(emp);
    }

    public Employee getEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(()->new EmployeeNotFoundException("Employee with"+id+"not found"));
    }
}
