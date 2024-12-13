package com.springCourse.apiCrudDemoSpringDataJPA.dao;

import com.springCourse.apiCrudDemoSpringDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // and thats it!
}
