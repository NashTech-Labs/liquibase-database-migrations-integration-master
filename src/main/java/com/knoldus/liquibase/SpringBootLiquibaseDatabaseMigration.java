package com.knoldus.liquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.knoldus.liquibase.entity.Employee;
import com.knoldus.liquibase.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootLiquibaseDatabaseMigration implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLiquibaseDatabaseMigration.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
	}
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Deepak Kumar");
		employee.setEmail("deepak@knoldus.com");
		employee.setSalary(80000.00);
		return employee;
	}
}
