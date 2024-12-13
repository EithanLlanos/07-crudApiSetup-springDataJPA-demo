package com.springCourse.apiCrudDemoSpringDataJPA.dao;

import com.springCourse.apiCrudDemoSpringDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//add custom path, if not specified it uses a plural, lowercase version of the entity name.
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // and thats it!
}
