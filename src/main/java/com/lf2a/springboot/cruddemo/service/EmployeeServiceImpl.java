package com.lf2a.springboot.cruddemo.service;

import com.lf2a.springboot.cruddemo.dao.IEmployeeDAO;
import com.lf2a.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDAO iEmployeeDAO;

    @Autowired
    public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return iEmployeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return iEmployeeDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        iEmployeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        iEmployeeDAO.delete(id);
    }
}
