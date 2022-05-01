package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
//declare instance variables
	
	@Id   //primary key 
	@GeneratedValue(strategy = GenerationType.AUTO)//autogenerate id as with anotation//
	
	private Long departmentId;
	private String  departmentName;
	private String departmentAddress;
//generate contructor with no arguments and with all arguments//
	public Department() {
		super();
		
	}
public Department(Long departmentId, String departmentName, String departmentAddress) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentAddress = departmentAddress;
}
	//setter and getter//
public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}
// generate tostring method//
@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
			+ departmentAddress + "]";
}
	
	
}

