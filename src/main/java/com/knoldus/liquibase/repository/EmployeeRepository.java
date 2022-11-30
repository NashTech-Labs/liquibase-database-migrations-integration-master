package com.knoldus.liquibase.repository;

import com.knoldus.liquibase.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
