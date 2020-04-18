package com.cg.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value(value="12345")
	private int employeeId;
	
	@Value(value="yashveer")
	private String employeeName;
	
	@Value(value="79541214")
	private double salary;
	
	@Value(value="PES-BU")
	private String businessUnit;
	
	@Value(value="21")
	private int age;
	
	@Autowired
	private SBU sbu;
	
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + "]";
	}
	
	public SBU getSbuDetails() {
		return sbu;
	}
	
}
