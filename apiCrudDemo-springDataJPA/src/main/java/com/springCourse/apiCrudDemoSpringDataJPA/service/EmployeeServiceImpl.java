package com.springCourse.apiCrudDemoSpringDataJPA.service;

import com.springCourse.apiCrudDemoSpringDataJPA.dao.EmployeeRepository;
import com.springCourse.apiCrudDemoSpringDataJPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    private final EmployeeRepository employeeRepository;

    // Set up constructor injection
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return null;
    }

    @Override
    public void deleteById(int theId) {
    }


}
