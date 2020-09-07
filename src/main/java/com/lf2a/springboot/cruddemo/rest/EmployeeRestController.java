package com.lf2a.springboot.cruddemo.rest;

import com.lf2a.springboot.cruddemo.dao.IEmployeeDAO;
import com.lf2a.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private IEmployeeDAO iEmployeeDAO;

    @Autowired
    public EmployeeRestController(IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return iEmployeeDAO.findAll();
    }
}
