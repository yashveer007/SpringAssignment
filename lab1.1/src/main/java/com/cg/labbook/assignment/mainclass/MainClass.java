package com.cg.labbook.assignment.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.labbook.assignment.Employee;

public class MainClass {
	
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println("Employee Details"+"\n"+"-----------------------------------");
		System.out.println("Employee ID :"+employee.getEmployeeId());
		System.out.println("Employee Name :"+employee.getEmployeeName());
		System.out.println("Employee Salary :"+employee.getSalary());
		System.out.println("Employee BU :"+employee.getBusinessUnit());
		System.out.println("Employee age :"+employee.getAge());
	}
}
