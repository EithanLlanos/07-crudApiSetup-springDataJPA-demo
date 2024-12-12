package com.springCourse.apiCrudDemoSpringDataJPA.service;


import com.springCourse.apiCrudDemoSpringDataJPA.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
