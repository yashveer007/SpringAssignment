package com.cg.assignment.mainclass;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.assignment.beans.Employee;
import com.cg.assignment.beans.Sbu;
import com.cg.assignment.config.ApplicationConfig;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Sbu sbu=(Sbu)context.getBean(Sbu.class);
		List<Employee> emp=sbu.getEmployee();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter employee Id :");
		int id=scanner.nextInt();
		for(Employee employee:emp) {
			if(employee.getEmployeeId()==id) {
				System.out.println("Employee Info :");
				System.out.println("Employee ID :"+ employee.getEmployeeId());
				System.out.println("Employee Name :"+ employee.getEmployeeName());
				System.out.println("Employee Salary :"+ employee.getSalary());
			}
		}
		
	}

}
