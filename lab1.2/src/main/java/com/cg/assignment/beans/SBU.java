package com.cg.assignment.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value(value="14560")
	private int sbuId;
	
	@Value(value="Product Engineering Services")
	private String sbuName;
	
	@Value(value="Ramesh Rao")
	private String sbuHead;
	
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
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
	
}
