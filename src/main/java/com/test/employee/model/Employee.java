package com.test.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    @Column(name="empname", length =50, nullable = false )
    private String name;
    @Column(name="empno", length =50, nullable = false )
    private String pNo;

    public Employee(){}

    public Employee(Long empId, String name, String pNo) {
        super();
        this.empId = empId;
        this.name = name;
        this.pNo = pNo;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }
    
    
}
