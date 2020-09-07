package com.lf2a.springboot.cruddemo.dao;

import com.lf2a.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public List<Employee> findAll();
}
