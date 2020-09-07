package com.lf2a.springboot.cruddemo.rest;

import com.lf2a.springboot.cruddemo.entity.Employee;
import com.lf2a.springboot.cruddemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private IEmployeeService iEmployeeService;

    @Autowired
    public EmployeeRestController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return iEmployeeService.findAll();
    }
}
