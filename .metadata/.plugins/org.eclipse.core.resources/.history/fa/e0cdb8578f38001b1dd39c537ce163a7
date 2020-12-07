package com.atom.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private Long dId;
	private String dName;
	private String dAddress;
	private String dCode;
	
	public Department() {
	
	}
	
	public Department(String dName, String dAddress, String dCode) {
		this.dName = dName;
		this.dAddress = dAddress;
		this.dCode = dCode;
	}

	public Long getdId() {
		return dId;
	}

	public void setdId(Long dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public String getdCode() {
		return dCode;
	}

	public void setdCode(String dCode) {
		this.dCode = dCode;
	}
	
	


	
	
	
	
	
}
