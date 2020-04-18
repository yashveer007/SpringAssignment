package com.cg.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.assignment.beans.Employee;

@Configuration
@ComponentScan("com.cg.assignment.beans")
public class ApplicationConfig {
	
	@Bean
	public Employee getEmployee() {
		Employee employee= new Employee();
		employee.setEmployeeId(12345);
		employee.setEmployeeName("yashveer");
		employee.setSalary(4000000);
		return employee;
	}
	
	
	@Bean
	public Employee getAnotherEmployee() {
		Employee employee= new Employee();
		employee.setEmployeeId(12346);
		employee.setEmployeeName("naman");
		employee.setSalary(50000);
		return employee;
	}
	
}
