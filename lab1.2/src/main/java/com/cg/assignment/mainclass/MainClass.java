package com.cg.assignment.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.assignment.beans.Employee;
import com.cg.assignment.beans.SBU;
import com.cg.assignment.config.ApplicationConfig;


public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employee employee = (Employee)context.getBean(Employee.class);
		System.out.println("Employee Details \n ----------------------------------------");
		System.out.println(employee);
		SBU sbu=employee.getSbuDetails();
		System.out.println("Sbu details [  sbuID= "+sbu.getSbuId()+"  sbuHead= "+sbu.getSbuHead()+"  sbuName= "+sbu.getSbuName()+"]");
		
	}

}
