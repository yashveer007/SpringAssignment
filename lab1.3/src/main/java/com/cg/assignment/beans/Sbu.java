package com.cg.assignment.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sbu {
	
	@Value(value="PES BU")
	private String sbuCode;
	
	@Value(value="Kiran Rao")
	private String sbuName;
	
	@Value(value="Product Engineering Services")
	private String sbuHead;
	
	@Autowired
	private List<Employee> Employee ;
	
	
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmployee() {
		return Employee;
	}
	public void setEmployee(List<Employee> employee) {
		Employee = employee;
	}
	
	@Override
	public String toString() {
		return "Sbu [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", Employee=" + Employee
				+ "]";
	}
	
	
}
