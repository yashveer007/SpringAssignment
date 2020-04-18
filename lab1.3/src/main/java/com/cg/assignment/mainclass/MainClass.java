package com.cg.assignment.mainclass;

import java.util.List;

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
		System.out.println("SBU Details \n ------------------------------------------");
		System.out.println("sbuCode= "+sbu.getSbuCode()+" sbuHead= "+sbu.getSbuHead()+" sbuName= "+sbu.getSbuName());
		System.out.println();
		System.out.println("Employee Details \n ------------------------------------------");
		System.out.print(" [");
		for(Employee employee:emp) {
			System.out.print("Employee [empId = "+employee.getEmployeeId()+" empSalary= "+employee.getSalary()+" empName= "+employee.getEmployeeName()+" ]");
		}
		System.out.println("]");
	}

}
